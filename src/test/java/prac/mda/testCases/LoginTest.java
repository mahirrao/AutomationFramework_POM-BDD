package prac.mda.testCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import prac.mda.pages.HomePage;
import prac.mda.pages.LoginPage;
import prac.mda.pages.ZohoAppPage;
import prac.mda.utilities.Utilities;

public class LoginTest extends BaseTest
{
	@Test(dataProviderClass = Utilities.class, dataProvider = "TestData")
	public void loginTest(Hashtable<String, String> data) throws InterruptedException
	{
		if (data.get("RunMode").equalsIgnoreCase("y"))
		{
			HomePage home = new HomePage();
			LoginPage login = home.goToLogIn();
			login.doLogIn(data.get("UserName"), data.get("Password"));
		}
	}
}
