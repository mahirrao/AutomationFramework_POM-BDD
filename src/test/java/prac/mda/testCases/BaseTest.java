package prac.mda.testCases;

import org.testng.annotations.AfterSuite;

import prac.mda.Base.Page;

public class BaseTest
{
	/*
	 * Implements the methods common to all the tests
	 */
	@AfterSuite
	public void tearDown()
	{
//		Page.quit();		
	}
	
}
