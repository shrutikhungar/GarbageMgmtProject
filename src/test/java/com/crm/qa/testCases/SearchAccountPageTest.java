package com.crm.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rsg.qa.pages.SearchAccountPage;

public class SearchAccountPageTest {
	
	SearchAccountPage searchAccountPageObj;
	@BeforeMethod
	public void searchAccountPageTestSetUp() {
		System.out.println("Inside searchAccountPageTestSetUp");
		searchAccountPageObj=new SearchAccountPage();
	}
	
	@Test
	public void searchPaginationTest() {
		System.out.println("Inside searchPaginationTest");
		searchAccountPageObj.searchPagination();		
	}
	
	@Test
	public void searchBasedOnAccountNameTest() {
		System.out.println("Inside searchBasedOnAccountNameTest");
		searchAccountPageObj.searchBasedOnAccountName();		
	}
	
	@AfterMethod
	public void searchAccountPageTestTearDown() {
		System.out.println("Inside searchAccountPageTestTearDown");
		System.out.println("*******************************");
	}

}
