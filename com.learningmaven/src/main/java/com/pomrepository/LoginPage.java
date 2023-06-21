package com.pomrepository; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement EmailTextFiled;
	
	@FindBy(id="Password")
	private WebElement PasswordTextFiled;
    
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LoginButton;
	
	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getEmailTextFiled() {
		return EmailTextFiled;
	}

	public WebElement getPasswordTextFiled() {
		return PasswordTextFiled;
	}
	
	public void enterEmail(String Email)
	{
		EmailTextFiled.sendKeys(Email);
	}
	public void enterPassword(String Password)
	{
		PasswordTextFiled.sendKeys(Password);
	}
    public void clickLoginButton()
    {
    	LoginButton.click();
    }

}
