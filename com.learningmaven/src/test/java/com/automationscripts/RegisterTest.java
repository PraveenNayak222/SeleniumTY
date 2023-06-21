package com.automationscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest {
	@DataProvider(name="RegisterData")
	public String[][] registerData()
	{
	  String[][]data=new String[1][5];	
	  data[0][0]="Rakesh";
	  data[0][1]="Kotian";
	  data[0][2]="rakesh411@gmail.com";
	  data[0][3]="Rakesh@123";
	  data[0][4]="Rakesh@123";
	  
	  return data;
	}
	@Test(dataProvider="RegisterData")
	public void registerTest(String fn,String ln,String mail,String pwd,String cpwd)
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fn);
		driver.findElement(By.id("LastName")).sendKeys(ln);
		driver.findElement(By.id("Email")).sendKeys(mail);	
		driver.findElement(By.id("Password")).sendKeys(pwd);	
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
		driver.findElement(By.id("register-button")).click();
		driver.close();
	}
}
