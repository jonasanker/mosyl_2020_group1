package org.mdse.pts.schedule.interpreter;

import org.mdse.pts.common.Time;
import org.mdse.pts.common.WeekDay;

public class WeekDayUtilities {
	static WeekDay getDay(WeekDay day, Time lastTime, Time nextTime) {
		if(TimeUtilities.timeToMinutes(nextTime) < TimeUtilities.timeToMinutes(lastTime)) return getNextDay(day);
		return day;
	}
	
	static WeekDay getNextDay(WeekDay day) {
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
