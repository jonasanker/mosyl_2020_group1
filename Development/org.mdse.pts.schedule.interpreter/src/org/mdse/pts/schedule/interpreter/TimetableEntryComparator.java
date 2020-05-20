package org.mdse.pts.schedule.interpreter;

import java.util.Comparator;

import org.mdse.pts.common.Time;
import org.mdse.pts.timetable.Entry;

public class TimetableEntryComparator implements Comparator<Entry> {

	@Override
	public int compare(Entry e1, Entry e2) {
		//Primary sorting: Weekday, Monday first
		int weekDayComparison = e1.getWeekDay().compareTo(e2.getWeekDay());
		if(weekDayComparison != 0) return weekDayComparison;
		
		Time time1 = e1.getTime();
		Time time2 = e2.getTime();
		
		//Secondary sorting: Hours, 0 first
		int hoursComparison = Integer.compare(time1.getHours(), time2.getHours());
		if(hoursComparison != 0) return hoursComparison;
		
		//Tertiary sorting: Minutes: 0 first
		return Integer.compare(time1.getMinutes(), time2.getMinutes());
    }

}
