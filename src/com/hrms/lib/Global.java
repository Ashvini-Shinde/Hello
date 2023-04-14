package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
	public WebDriver driver;
	//To provide Testdata & Objects / element for whole application
	//      Test data
	// 
	public String url ="http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw  = "nareshit";
	
	//************** Objects/ Elements
	// DT      Var       VV 
	public String txt_loginname = "txtUserName";
	public String txt_password  = "txtPassword";
	public String btn_login     =  "Submit";
	public String link_logout   = "Logout";
	

}
