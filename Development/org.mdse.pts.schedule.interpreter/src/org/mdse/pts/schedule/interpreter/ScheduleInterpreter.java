package org.mdse.pts.schedule.interpreter;

import org.mdse.pts.schedule.DepartureDay;
import org.mdse.pts.schedule.Frequency;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.Stop;
import org.mdse.pts.schedule.TrainSchedule;
import org.mdse.pts.timetable.Arrival;
import org.mdse.pts.timetable.Departure;
import org.mdse.pts.timetable.Timetable;
import org.mdse.pts.timetable.TimetableFactory;

import org.mdse.pts.common.CommonFactory;
import org.mdse.pts.common.Time;
import org.mdse.pts.common.WeekDay;

import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Network;
import org.mdse.pts.network.Station;
import org.mdse.pts.depot.Depot;
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
		
		return timetables;
	}
	
	private void interpretTrainSchedules(EList<TrainSchedule> trainSchedules, EList<Station> stations, HashMap<String, Timetable> timetables) {
		for(TrainSchedule trainSchedule : trainSchedules) {
			EList<Frequency> frequencies = trainSchedule.getFrequencies();
			EList<Stop> routeStops = trainSchedule.getRoute().getStops();
			Train train = trainSchedule.getTrain();
			for(Frequency frequency : frequencies) {
				for(Time time : frequency.getTime()) {
					for(DepartureDay day : frequency.getDay()) {
						Station prevStation = null;
						Time currentTime = time;
						for(int i = 0; i < routeStops.size(); i++) {
							Stop stop = routeStops.get(i);
							
							Station nextStation = null;
							if(i < routeStops.size()-1) nextStation = stop.getStation();
							Station station = stop.getStation();
							
							int minutes = getRunTimeInMinutes(stop.getVia(), prevStation, station);
							
							currentTime = addMinutesToTime(currentTime, minutes);
							addArrival(timetables, station, prevStation, currentTime, day.getWeekday(), train, stop.getPlatform());
							
							currentTime = addMinutesToTime(currentTime, stop.getDuration());
							addDeparture(timetables, station, nextStation, currentTime, day.getWeekday(), train, stop.getPlatform());
							
							prevStation = station;
						}
					}
				}
				
			}
			
		}
	}
	
	private int getRunTimeInMinutes(Leg via, Station prevStation, Station station) {
		if(prevStation == null) return 0;
		if(via != null) return via.getDistance();
		
		int distance = 0;
		List<Leg> legsToStop = getLegsBetweenStations(prevStation, station);
		if(legsToStop.size() >= 1) distance = legsToStop.get(0).getDistance(); //if has legs and no via, just take the first
		else throw new ScheduleInterpreterException("No legs goes to this station! " + station.getName());
		int minutes = distance / 2; //TODO: train.getSpeed()/60; //(kilometers per minute)
		return minutes;
	}
	
	private void addDeparture(HashMap<String, Timetable> timetables, Station station, Station nextStation, Time currentTime, WeekDay day, Train train, int platform) {
		Departure departure = TimetableFactory.eINSTANCE.createDeparture();
		departure.setPlatform(platform);
		departure.setNextStation(nextStation != null ? nextStation.getName() : null);
		departure.setTime(currentTime);
		departure.setWeekDay(day);
		departure.setTrain(train.getName());
		timetables.get(station.getName()).getDepartures().add(departure);
	}

	private void addArrival(HashMap<String,Timetable> timetables, Station station, Station prevStation, Time currentTime, WeekDay day, Train train, int platform) {
		Arrival arrival = TimetableFactory.eINSTANCE.createArrival();
		arrival.setPlatform(platform);
		arrival.setPreviousStation(prevStation != null ? prevStation.getName() : null);
		arrival.setTime(currentTime);
		arrival.setWeekDay(day);
		arrival.setTrain(train.getName());
		timetables.get(station.getName()).getArrivals().add(arrival);
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
			if((leg.getStation1().getName().equals(origin.getName()) && leg.getStation2().getName().equals(destination.getName())) || 
				(leg.getStation2().getName().equals(origin.getName()) && leg.getStation1().getName().equals(destination.getName()))) {
				legs.add(leg);
			}
		}
		return legs;
	}
	
	private Time addMinutesToTime(Time time, int minutes) {
		return minutesToTime(timeToMinutes(time)+minutes);
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
}
