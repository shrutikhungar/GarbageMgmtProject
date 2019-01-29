package com.crm.qa.testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rsg.qa.base.Base;
import com.rsg.qa.pages.CreateAccountPage;

public class CreateAccountPageTest extends Base{
	
	Base baseObj;
	CreateAccountPage createAccountPageObj;
	public CreateAccountPageTest() throws IOException {
		super();
		System.out.println("Inside child CreateAccountPageTest constructor");	
	}
	
	@BeforeTest
	public void createAccountPageTestSetUp() throws IOException {
		System.out.println("Inside createAccountPageTestSetUp");
		initializeBrowser();
		System.out.println("driver in CreateAccountPageTest: "+driver);
		createAccountPageObj=new CreateAccountPage(driver);
	}
	
	@Test
	public void createAccountPageTest() {
		System.out.println("Inside test createAccountPageTest");
		createAccountPageObj.CreateAccount();
	}
	@AfterTest
	public void createAccountPageTestTearDown() {
		System.out.println("Inside afterTest createAccountPageTest");
	}
}
