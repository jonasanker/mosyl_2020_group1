package org.mdse.pts.schedule.interpreter;

import org.mdse.pts.schedule.DepartureDay;
import org.mdse.pts.schedule.Frequency;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.Stop;
import org.mdse.pts.schedule.TrainSchedule;
import org.mdse.pts.timetable.Arrival;
import org.mdse.pts.timetable.Departure;
import org.mdse.pts.timetable.Entry;
import org.mdse.pts.timetable.Timetable;
import org.mdse.pts.timetable.TimetableFactory;

import org.mdse.pts.common.CommonFactory;
import org.mdse.pts.common.Time;
import org.mdse.pts.common.WeekDay;

import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;
import org.mdse.pts.depot.Train;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;

public class ScheduleInterpreter {
	public HashMap<String,Timetable> interpret(Schedule schedule) {
		EList<Station> stations = schedule.getNetwork().getStations();
		
		HashMap<String,Timetable> timetables = createTimetables(stations);
		
		EList<TrainSchedule> trainSchedules = schedule.getTrainschedules();
		
		interpretTrainSchedules(trainSchedules, stations, timetables);
		
		for(String stationName : timetables.keySet()) {
			timetables.get(stationName).getArrivals().sort(new TimetableEntryComparator());
			timetables.get(stationName).getDepartures().sort(new TimetableEntryComparator());
		}
		
		return timetables;
	}
	
	private void interpretTrainSchedules(EList<TrainSchedule> trainSchedules, EList<Station> stations, HashMap<String, Timetable> timetables) {
		for(TrainSchedule trainSchedule : trainSchedules) {
			EList<Frequency> frequencies = trainSchedule.getFrequencies();
			EList<Stop> routeStops = trainSchedule.getRoute().getStops();
			Train train = trainSchedule.getTrain();
			for(Frequency frequency : frequencies) {
				for(DepartureDay day : frequency.getDay()) {
					for(Time time : frequency.getTime()) {
						Station prevStation = null;
						Time currentTime = time;
						Time nextTime = time;
						WeekDay weekDay = day.getWeekday();
						for(int i = 0; i < routeStops.size(); i++) {
							Stop stop = routeStops.get(i);
							
							Station nextStation = null;
							if(i < routeStops.size()-1) nextStation = stop.getStation();
							Station station = stop.getStation();
							
							int minutes = getRunTimeInMinutes(stop.getVia(), prevStation, station, train);
							
							nextTime = addMinutesToTime(currentTime, minutes);
							weekDay = getDay(weekDay, currentTime, nextTime);
							currentTime = nextTime;
							addArrival(timetables, station, prevStation, currentTime, weekDay, train, stop.getPlatform());
							
							nextTime = addMinutesToTime(currentTime, stop.getDuration());
							weekDay = getDay(weekDay, currentTime, nextTime);
							currentTime = nextTime;
							addDeparture(timetables, station, nextStation, currentTime, weekDay, train, stop.getPlatform());
							
							prevStation = station;
						}
					}
				}
				
			}
			
		}
	}
	
	private int getRunTimeInMinutes(Leg via, Station prevStation, Station station, Train train) {
		if(prevStation == null) return 0;
		
		int distance = 0;
		List<Leg> legsBetweenStations = getLegsBetweenStations(prevStation, station);
		
		if(via != null) distance = via.getDistance();
		//if has legs and no via, just take the first
		else if(legsBetweenStations.size() >= 1) distance = legsBetweenStations.get(0).getDistance(); 
		else throw new ScheduleInterpreterException("No legs goes to this station! " + station.getName());
		
		//(minutes) = (kilometers) / ((kilometers per minute) / (minutes per hour))
		int minutes = distance / ((train.getTrainSpeed() / 60)); 
		
		return minutes;
	}
	
	private void addDeparture(HashMap<String, Timetable> timetables, Station station, Station nextStation, Time currentTime, WeekDay day, Train train, int platform) {
		Departure departure = TimetableFactory.eINSTANCE.createDeparture();
		setTimetableEntryInfo(departure, platform, currentTime, day, train);
		departure.setNextStation(nextStation != null ? nextStation.getName() : null);
		timetables.get(station.getName()).getDepartures().add(departure);
	}

	private void addArrival(HashMap<String,Timetable> timetables, Station station, Station prevStation, Time currentTime, WeekDay day, Train train, int platform) {
		Arrival arrival = TimetableFactory.eINSTANCE.createArrival();
		setTimetableEntryInfo(arrival, platform, currentTime, day, train);
		arrival.setPreviousStation(prevStation != null ? prevStation.getName() : null);
		timetables.get(station.getName()).getArrivals().add(arrival);
	}
	
	private void setTimetableEntryInfo(Entry entry, int platform, Time currentTime, WeekDay day, Train train) {
		entry.setPlatform(platform);
		entry.setTime(currentTime);
		entry.setWeekDay(day);
		entry.setTrain(train.getName());
	}

	private HashMap<String,Timetable> createTimetables(EList<Station> stations) {
		HashMap<String,Timetable> timetables = new HashMap<>();
		for(int i = 0; i < stations.size(); i++) {
			Station station = stations.get(i);
			Timetable timetable = TimetableFactory.eINSTANCE.createTimetable();
			timetable.setStation(station.getName());
			timetables.put(station.getName(), timetable);
		}
		return timetables;
	}
	
	private List<Leg> getLegsBetweenStations(Station origin, Station destination) {
		List<Leg> legs = new ArrayList<>();
		for(Leg leg : destination.getLegs()) {
			//I assume station names are unique
			String legStartStationName = leg.getStations().get(0).getName();
			String legEndStationName = leg.getStations().get(1).getName();
			if((legStartStationName.equals(origin.getName()) && legEndStationName.equals(destination.getName())) || 
				(legEndStationName.equals(origin.getName()) && legStartStationName.equals(destination.getName()))) {
				legs.add(leg);
			}
		}
		return legs;
	}
	
	private Time addMinutesToTime(Time time, int minutes) {
		//I assume that no trip between neighboring stations will be >= 24h
		int fullDayMinutes = 1440;
		int resultingMinutes = timeToMinutes(time)+minutes;
		if(resultingMinutes >= fullDayMinutes) resultingMinutes -= 1440; //if >= 24h, reset time to beginning of day
		return minutesToTime(resultingMinutes);
	}
	
	private int timeToMinutes(Time time) {
		return time.getHours()*60 + time.getMinutes();
	}
	
	private Time minutesToTime(int minutes) {
		Time time = CommonFactory.eINSTANCE.createTime();
		time.setHours(minutes/60);
		time.setMinutes(minutes%60);
		return time;
	}
	
	private WeekDay getDay(WeekDay day, Time lastTime, Time nextTime) {
		if(timeToMinutes(nextTime) < timeToMinutes(lastTime)) return getNextDay(day);
		return day;
	}
	
	private WeekDay getNextDay(WeekDay day) {
		switch(day) {
		case FRIDAY:
			return WeekDay.SATURDAY;
		case MONDAY:
			return WeekDay.TUESDAY;
		case SATURDAY:
			return WeekDay.SUNDAY;
		case SUNDAY:
			return WeekDay.MONDAY;
		case THURSDAY:
			return WeekDay.FRIDAY;
		case TUESDAY:
			return WeekDay.WEDNESDAY;
		case WEDNESDAY:
			return WeekDay.THURSDAY;
		default:
			return WeekDay.MONDAY;
		}
	}
}
