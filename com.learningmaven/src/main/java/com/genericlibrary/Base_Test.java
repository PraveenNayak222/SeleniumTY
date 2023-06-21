package com.genericlibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Test {
	
	public WebDriver driver;
	@BeforeClass 
	public void Browser_Setup()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void Browser_Tear_Down()
	{
	   driver.close();	
	}
}
