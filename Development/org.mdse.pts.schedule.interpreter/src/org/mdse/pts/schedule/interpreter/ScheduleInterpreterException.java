package org.mdse.pts.schedule.interpreter;

public class ScheduleInterpreterException extends RuntimeException {

	private static final long serialVersionUID = 2051214937588883312L;

	public ScheduleInterpreterException() {
	}

	public ScheduleInterpreterException(String arg0) {
		super(arg0);
	}

	public ScheduleInterpreterException(Throwable arg0) {
		super(arg0);
	}

	public ScheduleInterpreterException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ScheduleInterpreterException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
