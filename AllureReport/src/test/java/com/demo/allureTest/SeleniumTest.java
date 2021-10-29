package com.demo.allureTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.Allure.BaseClass;

import io.qameta.allure.Description;
import io.qameta.allure.Step;

@Listeners({com.allure.listners.AllureListners.class})
public class SeleniumTest   extends BaseClass
{

	
	@Test
	@Description("this is my first test")
	
	
	public void screenShotTest()
	{
		
		
		driver.get("https://www.facebook.com/");
		//launchapplication();
		
		logMessageInAllure("project Deleted Successfully");
		       
		
		
		
	}
	
	
	
	@Test
	@Description("this is my second test")
	
	
	public void screenShotTest_2()
	{
		
		
		logMessageInAllure("Request sent successfully");
		
		logMessageInAllure("project Updated Successfully");
		
		Assert.fail();
		
		
		
		
	}
	
	@Step("{0}")
	public String logMessageInAllure(String message)
	{
		return message;
	}
	
	@Step("clicked on logout")
	public void launch() 
	{
		System.out.println(" i am there");
	}
}
