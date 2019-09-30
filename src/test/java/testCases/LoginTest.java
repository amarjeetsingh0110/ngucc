package testCases;


import org.testng.annotations.Test;

import com.ngucc.Pages.LandingPage;

public class LoginTest {
	
	@Test(priority=1)
	public void validateLoginFunctionality()
	{
		new LandingPage().login();
	}
}
