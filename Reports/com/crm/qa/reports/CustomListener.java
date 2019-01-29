package com.crm.qa.reports;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rsg.qa.base.base;

public class CustomListener extends base implements ITestListener {

	public CustomListener() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Start");		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("..............................success..............................");		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("..............................fail..............................");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("..............................skipped..............................");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("............................On start.............................");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("..............................finish..............................");
	}

}
