package com.automationscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddToCartTest {
	@Test
	public void addToCartTest()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[3]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Desk')])[4]")).click();	
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"))));
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();	
		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]")).click();	
		driver.close();
	}
 
}
