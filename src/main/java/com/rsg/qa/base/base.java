package com.rsg.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.rsg.qa.util.ObjectRepositoryParser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base{
	
	String ObjectRepPropFilePath="C:\\Users\\D E L L\\eclipse-workspace\\GarbageMgmtProject\\src\\main\\java\\com\\rsg\\qa\\config\\configuration.properties";
	File objRepFileObj;
	Properties prop;
	FileInputStream fis;
	ObjectRepositoryParser objectRepositoryParserObj; 
	public WebDriver driver;
	int flag=1;
	public Base() throws IOException{
		System.out.println("Inside Base Parent constructor");
		if (flag==1) {
		objRepFileObj=new File(ObjectRepPropFilePath);
		fis=new FileInputStream(objRepFileObj);
		prop=new Properties();
		loadObjectRepFile(fis);
		objectRepositoryParserObj=new ObjectRepositoryParser();
		System.out.println("loadObjectRepFile successful");
		int flag=2;
		}
	}
	
	void loadObjectRepFile(FileInputStream fis) throws IOException {
		System.out.println("inside loadObjectRepFile");
		prop.load(fis);
	}
	
	public By readObjectRepFile(String locatorName) {
		System.out.println("inside readObjectRepFile");
		String locatorNameValuePair= prop.getProperty(locatorName);
		System.out.println("locatorNameValuePair is: "+locatorNameValuePair);	
		By locator=objectRepositoryParserObj.parselocatorNameValuePair(locatorNameValuePair);
		System.out.println(locator);
		return locator;		
	}
	
	public void initializeBrowser(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		//return driver;
	}
}