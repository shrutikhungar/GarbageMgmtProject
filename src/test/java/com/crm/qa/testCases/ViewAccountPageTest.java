package com.crm.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.rsg.qa.pages.ViewAccountPage;

public class ViewAccountPageTest {
	
	ViewAccountPage viewAccountPageObj;
	@BeforeMethod
	public void viewAccountPageTestSetUp() {
		System.out.println("Inside viewAccountPageTestSetUp");
		viewAccountPageObj=new ViewAccountPage();
	}
	
	@Test
	public void viewAccountDetailsTest() {
		System.out.println("Inside viewAccountDetailsTest");
		viewAccountPageObj.viewAccountDetails();
	}
	
	@Test
	public void sortAccountNameTest() {
		System.out.println("Inside sortAccountNameTest");
		viewAccountPageObj.sortAccountName();
	}
	
	@Test
	public void deleteAccountTest() {
		System.out.println("Inside deleteAccountTest");
		viewAccountPageObj.deleteAccount();
	}
	
	@AfterMethod
	public void viewAccountPageTestTearDown() {
		System.out.println("Inside viewAccountPageTestTearDown");
		System.out.println("*******************************");
	}

}
