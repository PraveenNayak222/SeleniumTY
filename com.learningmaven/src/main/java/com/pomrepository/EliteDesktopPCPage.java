package com.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EliteDesktopPCPage {
	WebDriver driver1;
	public EliteDesktopPCPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	@FindBy(xpath="//input[@value='Email a friend']")
	private WebElement EmailAFriendButton; 
	
	public void clickEmailAFriendButton()
	{
		EmailAFriendButton.click();
	}
	
	public String getTitle()
	{
		return driver1.getTitle();
	}
	
}
