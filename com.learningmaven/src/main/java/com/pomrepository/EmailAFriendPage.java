package com.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailAFriendPage {
	
	public EmailAFriendPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="FriendEmail")
	private WebElement FriendmailTextField;
	
	@FindBy(id="YourEmailAddress")
	private WebElement YourmailTextField;
	
	@FindBy(xpath="//input[@value='Send email']")
	private WebElement SendEmailButton;
	
	
	public void EnterFriendmail(String mail)
	{
		FriendmailTextField.sendKeys(mail);
	}
	
	public void EnterYourmail(String mail)
	{
		YourmailTextField.sendKeys(mail);
	}

	public void clickSendEmailButton()
	{
		SendEmailButton.click();
	}
	
}
