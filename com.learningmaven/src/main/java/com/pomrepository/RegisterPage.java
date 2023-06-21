package com.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="gender-male")
	private WebElement GenderMaleRadio;
	
	@FindBy(id="gender-female")
	private WebElement GenderFemaleRadio;
	
	@FindBy(id="FirstName")
	private WebElement FirstNameTextField;
	
	@FindBy(id="LastName")
	private WebElement LastNameTextField;
	
	@FindBy(id="Email")
	private WebElement EmailTextField;
	
	@FindBy(id="Password")
	private WebElement PasswordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextField;
	

	@FindBy(id="register-button")
	private WebElement RegisterButton;
	
	public void clickMaleRadio()
	{
		GenderMaleRadio.click();
	}
	public void clickFemaleRadio()
	{
		GenderFemaleRadio.click();
	}
	public void enterFirstName(String FirstName)
	{
		FirstNameTextField.sendKeys(FirstName);
	}
	public void enterLastName(String LastName)
	{
		LastNameTextField.sendKeys(LastName);
	}
	public void enterEmail(String Email)
	{
		EmailTextField.sendKeys(Email);
	}
	public void enterPassword(String Password)
	{
		PasswordTextField.sendKeys(Password);
	}
	public void confirmPassword(String ConfirmPassword)
	{
		ConfirmPasswordTextField.sendKeys(ConfirmPassword);
	}
	public void clickRegister()
	{
		RegisterButton.click();
	}
	public WebElement getGenderMaleRadio() {
		return GenderMaleRadio;
	}
	public WebElement getGenderFemaleRadio() {
		return GenderFemaleRadio;
	}
	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}
	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}
	public WebElement getEmailTextField() {
		return EmailTextField;
	}
	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}
	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	
}
