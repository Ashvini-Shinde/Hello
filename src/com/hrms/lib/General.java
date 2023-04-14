package com.hrms.lib;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class General extends Global {
	// To provide all re-usable fun:for whole application
	
	public void openApplication() {
		System.setProperty("webdriver.gecko.driver", "D:\\Web Drivers\\geckodriver-v0.32.2-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to(url);
		
	System.out.println("Application opened");
	}
public void closeApplication() {
	driver.close();
	System.out.println("Application closed");
		
	
	
}

	
}



