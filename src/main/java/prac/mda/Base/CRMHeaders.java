package prac.mda.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;

import prac.mda.pages.crm.accounts.AccountsHomePage;


public class CRMHeaders
{
	WebDriver driver;
	public CRMHeaders (WebDriver driver)
	{
		this.driver = driver;
	}
	public void goToHome()
	{
		
	}
	
	public void goToLeads()
	{
		
	}
	
	public void goToContacts()
	{
		
	}
	
	public AccountsHomePage goToAccounts()
	{
		if(!Page.isElementPresent("accountsPath_CSS"))
		{
			Page.click("hiddenMenuPath_CSS");
			Page.wait.until
			(ExpectedConditions.presenceOfElementLocated
					(Page.getElement("accountsHiddenPath_CSS")));

			Page.click("accountsHiddenPath_CSS");			
		}
		else
		Page.click("accountsPath_CSS");
		return new AccountsHomePage();
	}
	
	public void goToData()
	{
		
	}
	
	public void signOut()
	{
		
	}
}
