package com.hrms.utility;

import org.apache.log4j.Logger;

public class Log {
	// Intialize log$j logs
	
	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	//need to create these methods ,so that they can be callled
	
	public static void info(String message) {
		Log.info(message);
		
	}
	

}
