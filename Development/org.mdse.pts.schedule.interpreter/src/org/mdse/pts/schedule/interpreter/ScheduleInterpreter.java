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

import common.CommonFactory;
import common.Time;

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
		HashMap<String,Timetable> timetables = new HashMap<>();
		
		/*Instantiate timetables*/
		for(int i = 0; i < stations.size(); i++) {
			Station station = stations.get(i);
			Timetable timetable = TimetableFactory.eINSTANCE.createTimetable();
			timetable.setStation(station.getName());
			timetables.put(station.getName(), timetable);
		}
		
		EList<TrainSchedule> trainSchedules = schedule.getTrainschedules();
		
		for(TrainSchedule trainSchedule : trainSchedules) {
			EList<Frequency> frequencies = trainSchedule.getFrequency();
			EList<Stop> routeStops = trainSchedule.getRoute().getStop();
			Train train = trainSchedule.getTrain();
			for(Frequency frequency : frequencies) {
				for(Time time : frequency.getTime()) {
					for(DepartureDay day : frequency.getDay()) {
						Station prevStation = null;
						Time currentTime = time;
						for(int i = 0; i < routeStops.size(); i++) {
							Stop stop = routeStops.get(i);
							
							//Find next station
							Station nextStation = null;
							if(i < routeStops.size()-1) nextStation = stop.getStation();
							Station station = stop.getStation();
							
							//Calculate run time
							int distance = 0;
							Leg via = stop.getVia();
							List<Leg> legsToStop = getLegsEndingAtStation(station);
							if(via != null) distance = via.getDistance();
							else if(legsToStop.size() >= 1) distance = legsToStop.get(0).getDistance(); //if multiple legs and no via, just take the first
							else throw new ScheduleInterpreterException("No legs goes to this station! " + station.getName());
							int minutes = distance / 2; //TODO: train.getSpeed()/60; //(kilometers per minute)
							
							//Create arrival
							currentTime = addMinutesToTime(currentTime, minutes);
							Arrival arrival = TimetableFactory.eINSTANCE.createArrival();
							arrival.setPlatform(stop.getPlatform());
							arrival.setPreviousStation(prevStation != null ? prevStation.getName() : null);
							arrival.setTime(currentTime);
							arrival.setWeekDay(day.getWeekday());
							arrival.setTrain(train.getName());
							timetables.get(station.getName()).getArrivals().add(arrival);
							
							//Create departure
							currentTime = addMinutesToTime(currentTime, stop.getDuration());
							Departure departure = TimetableFactory.eINSTANCE.createDeparture();
							departure.setPlatform(stop.getPlatform());
							departure.setNextStation(nextStation != null ? nextStation.getName() : null);
							departure.setTime(currentTime);
							departure.setWeekDay(day.getWeekday());
							departure.setTrain(train.getName());
							timetables.get(station.getName()).getDepartures().add(departure);
							
							prevStation = station;
						}
					}
				}
				
			}
			
		}
		
		return timetables;
	}
	
	private List<Leg> getLegsOriginatingFromStation(Station origin) {
		List<Leg> legs = new ArrayList<>();
		for(Leg leg : origin.getLegs()) {
			if(leg.getStation1().getName().equals(origin.getName())) {
				legs.add(leg);
			}
		}
		return legs;
	}
	
	private List<Leg> getLegsEndingAtStation(Station destination) {
		List<Leg> legs = new ArrayList<>();
		for(Leg leg : destination.getLegs()) {
			if(leg.getStation2().getName().equals(destination.getName())) {
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
