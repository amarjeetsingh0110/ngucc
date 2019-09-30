package com.ngucc.Pages;

import javax.swing.text.Utilities;

import org.openqa.selenium.Alert;

import com.ngucc.framework.ManagerBaseClass;
import com.ngucc.utilities.CommonUtilities;

public class LandingPage extends ManagerBaseClass {
	
	public void login()
	{
		System.out.println(driver);
		CommonUtilities.type(locator.getProperty("loginText"), config.getProperty("userName"));
		CommonUtilities.type(locator.getProperty("passwordText"), config.getProperty("passWord"));
		CommonUtilities.click(locator.getProperty("loginButton"));
		CommonUtilities.click(locator.getProperty("alertOk"));
		
	}
	
	public void logOut()
	{
		CommonUtilities.click(locator.getProperty("logOutButton"));
	}
	
	

}
