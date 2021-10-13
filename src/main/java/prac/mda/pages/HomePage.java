package prac.mda.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import prac.mda.Base.Page;

public class HomePage extends Page
{
	public void goToSignUp()
	{
		System.out.println("Inside Sign Up");
		driver.findElement(By.cssSelector("a.zh-signup")).click();
	}

	public LoginPage goToLogIn()
	{
		System.out.println("Inside Log In");
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.zoho.com/index1.html"))
		{
			click("loginLinkOld_CSS");
			oldURL = true;
		} else
			click("loginLink_CSS");
		return new LoginPage();
	}

	public void goToSupport()
	{
		System.out.println("Inside Support");
		driver.findElement(By.cssSelector("a.zh-support")).click();
	}

}
