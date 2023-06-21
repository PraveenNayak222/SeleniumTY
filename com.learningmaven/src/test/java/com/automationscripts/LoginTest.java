package com.automationscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	@DataProvider(name="LoginData")
	public String[][] loginData()
	{
		String[][]data=new String[1][2];
		data[0][0]="rakesh411@gmail.com";
		data[0][1]="Rakesh@123";
		return data;	
	}

	@Test(dataProvider ="LoginData")
	public void loginTest(String mail,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(mail);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.close();
	}
}
