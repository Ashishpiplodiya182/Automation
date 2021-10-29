package com.allure.listners;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.Allure.BaseClass;


import io.qameta.allure.Allure;

public class AllureListners implements ITestListener 
{

	@Override
	public void onTestFailure(ITestResult result) {
		
		//ITestListener.super.onTestFailure(result);
		
		 try {
	            Allure.addAttachment("", new ByteArrayInputStream(((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.BYTES)));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	
	public void onFinish(ITestContext context) {
//		try {
//			//Runtime.getRuntime().exec("allure serve C:\\Users\\Dell\\Desktop\\Ashish_Appium\\AllureReport\\allure-results");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
