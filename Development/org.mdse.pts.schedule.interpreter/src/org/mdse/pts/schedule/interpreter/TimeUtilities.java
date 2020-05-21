package org.mdse.pts.schedule.interpreter;

import org.mdse.pts.common.CommonFactory;
import org.mdse.pts.common.Time;

public class TimeUtilities {
	static Time addMinutesToTime(Time time, int minutes) {
		//I assume that no trip between neighboring stations will be >= 24h
		int fullDayMinutes = 1440;
		int resultingMinutes = timeToMinutes(time)+minutes;
		if(resultingMinutes >= fullDayMinutes) resultingMinutes -= 1440; //if >= 24h, reset time to beginning of day
		return minutesToTime(resultingMinutes);
	}
	
	static int timeToMinutes(Time time) {
		return time.getHours()*60 + time.getMinutes();
	}
	
	static Time minutesToTime(int minutes) {
		Time time = CommonFactory.eINSTANCE.createTime();
		time.setHours(minutes/60);
		time.setMinutes(minutes%60);
		return time;
	}
}
