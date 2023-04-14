package com.hrms.lib1;

import org.openqa.selenium.WebDriver;

public class Global {
	
	public WebDriver driver;
	// DT    Var    VV
	public String url = "http://183.82.103.245/nareshit/login.php";
	
	public String username = "nareshit";
	public String Password = "nareshit";
	public String EFN      = "ashvini";
    public String ELN      = "shinde";
    
    public String txt_loginname  = "txtUserName";
    public String txt_password   =   "txtPassword";
    public String btn_Login      =   "Submit";
    public String link_logout    =  "Logout";
    public String frame_empinfo  =   "rightMenu";
    public String btn_Add        =   "/html/body/div/div[2]/form/div[3]/div[1]/input[1]";
    public String txt_EFN        =  "txtEmpFirstName";
    public String txt_ELN        =  "txtEmpLastName";
    public String btn_Save       =  "btnEdit";

}
