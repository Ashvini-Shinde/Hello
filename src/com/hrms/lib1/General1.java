package com.hrms.lib1;

import java.sql.Driver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utility.Log;
public class General1 extends Global 
{
	public void openApplication(){
		
		System.setProperty("webdriver.gecko.driver", "D:\\Web Drivers\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
		
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Log.info("Open Aooliaction");
		
	}
	public void closeApplication() {
		driver.close();
		System.out.println("application closed");
		Log.info("Close Appliaction");
	}
	
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(Password);
		driver.findElement(By.name(btn_Login)).click();
		
		System.out.println("login completed");
		Log.info("Login Appliaction");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		
		System.out.println("logout completed");
		Log.info("Logout");
		
	}
	public void enterFrame() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("entered into frame");
		
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exit from logout");
	}
	
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
   driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
   driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
   driver.findElement(By.id(btn_Save)).click();
   System.out.println("added New Emp");
   
	}
}

