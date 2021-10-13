package prac.mda.pages.crm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import prac.mda.Base.Page;


public class CRMhomePage extends Page
{
	public void verifyHomepage()
	{
		List<WebElement> elements = driver.findElements(By.cssSelector("#HomePage_Selector"));
		if(elements.isEmpty())
			System.out.println("CRM Homepage not present");
	}
}
