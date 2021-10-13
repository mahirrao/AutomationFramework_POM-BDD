package prac.mda.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import prac.mda.Base.Page;
import prac.mda.pages.HomePage;
import prac.mda.pages.LoginPage;
import prac.mda.pages.ZohoAppPage;
import prac.mda.pages.crm.accounts.AccountsHomePage;
import prac.mda.pages.crm.accounts.CreateAccountsPage;

public class LoginCheck extends RoughBase
{

	public static final String baseDir = System.getProperty("user.dir");

	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver",
//				baseDir + "\\src\\test\\resources\\prac\\mda\\webDriverExecutables\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://chartink.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		System.out.println(loginCheck.toString());

//		HomePage home = new HomePage();
////		home.goToLogIn();
//
//		String userName = "mayuresh.ahirrao@gmail.com";
//		String password = "oArrhia31885";
//
//		LoginPage login = home.goToLogIn();
//		login.loginToSite(userName, password);
//		login.goToScreenersPage();

//		ScreenersPage screener = login.goToScreenersPage();
//		screener.searchScreeners("LT Daily must see @ 3.20 5 EMA, 20 EMA Positive Crossover (Daily)");
		

//		driver.findElement(By.xpath("//a[normalize-space()='Login/Register']")).click();
//
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mayuresh.ahirrao@gmail.com");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("oArrhia31885");
//		driver.findElement(By.xpath("//button/span")).click();
		
		HomePage home = new HomePage();		
		
		LoginPage login = home.goToLogIn();
		
		ZohoAppPage dashboard;
		try {
			dashboard = login.doLogIn("md.ahirrao@gmail.com", "Pratapgad10November");
			dashboard.goToCRM();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		AccountsHomePage account = Page.header.goToAccounts();
		
		CreateAccountsPage cap = account.goToCreateAccountPage();
		cap.createAccount("Ahirrao");
	}

}
