package com.crm.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rsg.qa.pages.CreateAccountPage;

public class CreateAccountPageTest {
	
	CreateAccountPage createAccountPageObj;
	
	@BeforeMethod
	public void createAccountPageTestSetUp() {
		System.out.println("Inside createAccountPageTestSetUp");
		createAccountPageObj=new CreateAccountPage();
	}
	
	@Test
	public void createAccountTest() {
		System.out.println("Inside createAccountTest");
		createAccountPageObj.createAccount();
	}
	
	@AfterMethod
	public void createAccountPageTestTearDown() {
		System.out.println("Inside createAccountPageTestTearDown");
		System.out.println("*******************************");
	}
}