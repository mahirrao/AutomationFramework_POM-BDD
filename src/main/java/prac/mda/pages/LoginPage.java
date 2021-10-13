package prac.mda.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import prac.mda.Base.Page;


public class LoginPage extends Page
{
	
	public ZohoAppPage doLogIn(String username, String password) throws InterruptedException
	{
		System.out.println("Inside Login");

		Thread.sleep(10000);
		type("userName_CSS", username);
		click("getPasswordbutton_CSS");
		Thread.sleep(5000);
		type("password_CSS", password);
		click("loginButton_CSS");
		return new ZohoAppPage();
	}

}
