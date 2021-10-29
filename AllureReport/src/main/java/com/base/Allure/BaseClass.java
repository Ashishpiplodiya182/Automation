package com.base.Allure;
import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import org.w3c.dom.Document;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.w3c.dom.Element;
import com.google.common.collect.ImmutableMap;

public class BaseClass 
{
	public static final String EXCELPATH = System.getProperty("user.dir") + "./allure-results/environment.xml";
	public static WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	@BeforeSuite
    void setAllureEnvironment() throws ParserConfigurationException, TransformerException {
		
    }
	@BeforeClass
	public void openBrowser()
	{
		 driver = new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
	}

	@AfterClass
	public void closeBrowser()
	{
		 driver.quit();
		
	}

	
	
}
