package com.hrms.autoscripts;
import com.hrms.lib.General;
public class TC001 {
	public static void main(String args[]) {
		// Test steps 
		General obj = new General();
		obj.openApplication();
		obj.closeApplication();
		
	}

}
