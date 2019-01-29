package com.rsg.qa.util;

import org.openqa.selenium.By;

public class ObjectRepositoryParser{
	public By parselocatorNameValuePair(String locatorNameValuePair){
		System.out.println("Inside parselocatorNameValuePair");
		String locatorName=locatorNameValuePair.split(":")[0];
		String elementAttribute=locatorNameValuePair.split(":")[1];
		By locator=null;
		switch(locatorName) {
		case "Id":
			locator=By.id(elementAttribute);
			break;
		case "Name":
			locator=By.name(elementAttribute);
			break;
		case "linkText":
			locator=By.linkText(elementAttribute);
			break;
		}
		System.out.println("Inside parselocatorNameValuePair: locator value: "+locator);
		return locator;
	}
}