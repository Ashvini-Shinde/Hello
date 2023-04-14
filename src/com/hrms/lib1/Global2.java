package com.hrms.lib1;

import org.openqa.selenium.WebDriver;

public class Global2 {
	
	public WebDriver driver;
	
	//to provide test data &Objects/elements for whole application
	
	//DT               Var               VV
 public String        url            =      "http://183.82.103.245/nareshit/login.php";
 public String         un            =       "nareshit";
 public String      password         =       "nareshit";
 public String         EFN           =       "ashvini";
 public String         ELN           =       "shinde";
 
 
 //*********** Object/elements
 public String txt_loginname = "txtUserName";
 public String txt_password = "txtPassword";
 public String btn_login   = "Submit";
 public String link_logout = "Logout";
 public String frame_empinfo = "rightMenu";
 public String btn_Add  = "//input[@value='Add']";
 public String txt_EFN = "txtEmpFirstName";
 public String txt_ELN  = "txtEmpLastName";
 public String btn_save = "btnEdit";
}
