package com.rsg.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rsg.qa.base.Base;

public class CreateAccountPage{
	Base baseObj;
	private WebDriver driver;
	public CreateAccountPage(WebDriver driver) throws IOException {
		this.driver=driver;
		System.out.println("driver in CreateAccountPage: "+driver);
		baseObj=new Base();
	}
	public By readCreateAccountPageElements(String ElementName){
		System.out.println("inside readCreateAccountPageElements");
		By locator = baseObj.readObjectRepFile("FirstName");
		return locator;	
	}
	
	public void CreateAccount(){
		System.out.println("insode CreateAccount");
		By locator=readCreateAccountPageElements("FirstName");
		driver.findElement(locator).sendKeys("Shruti");
		System.out.println("action performed on element");
	}
}
