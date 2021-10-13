package prac.mda.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import prac.mda.Base.Page;
import prac.mda.pages.crm.CRMhomePage;

public class ZohoAppPage extends Page
{

	public void goToBooks()
	{
		driver.findElement(By.cssSelector("#zl-myapps div.ea-app-container div:nth-child(1)")).click();

	}

	public CRMhomePage goToCRM()
	{
		if (oldURL)
			click("CRM_OldPage_CSS");
		else
			click("CRMpage_CSS");
		return new CRMhomePage();
	}
}
