package prac.mda.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
