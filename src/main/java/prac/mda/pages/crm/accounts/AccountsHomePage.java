package prac.mda.pages.crm.accounts;

import org.openqa.selenium.By;

import prac.mda.Base.Page;

public class AccountsHomePage extends Page
{
	public CreateAccountsPage goToCreateAccountPage()
	{
		click("CreateAccountsButton_CSS");
		return new CreateAccountsPage();
	}
}
