package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;



import com.hrms.lib1.General1;

public class TC001 {
	//public static void main(String[] args) {
		@Test
		public void tc001() 
		{
		DOMConfigurator.configure("log4j.xml");// configure ("log4j.xml");
			
			General1 obj = new General1();
			
			obj.openApplication();
			obj.login();
			obj.logout();
			obj.closeApplication();	
		
	}
}
