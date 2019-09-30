package testCases;

import org.testng.annotations.Test;

import com.ngucc.Pages.LandingPage;

public class LogOut {

	@Test
	public void validateLogOutFunctionality()
	{
		new LandingPage().logOut();
	}

}
