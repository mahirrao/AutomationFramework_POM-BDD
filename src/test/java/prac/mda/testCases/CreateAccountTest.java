package prac.mda.testCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import prac.mda.Base.Page;
import prac.mda.pages.ZohoAppPage;
import prac.mda.pages.crm.accounts.AccountsHomePage;
import prac.mda.pages.crm.accounts.CreateAccountsPage;
import prac.mda.utilities.Utilities;

public class CreateAccountTest
{
	@Test(dataProviderClass = Utilities.class, dataProvider = "TestData")
	public void createAccountTest(Hashtable<String, String> data)
	{
		ZohoAppPage dashboard = new ZohoAppPage();
		dashboard.goToCRM();
		AccountsHomePage account = Page.header.goToAccounts();
		CreateAccountsPage cap = account.goToCreateAccountPage();
		cap.createAccount(data.get("AccountName"));
	}
}
