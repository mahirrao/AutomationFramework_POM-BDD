package prac.mda.pages.crm.accounts;

import org.openqa.selenium.By;

import prac.mda.Base.Page;

public class CreateAccountsPage extends Page
{
	public void createAccount(String accountName)
	{
		type("accountName_CSS", accountName);
	}
}
