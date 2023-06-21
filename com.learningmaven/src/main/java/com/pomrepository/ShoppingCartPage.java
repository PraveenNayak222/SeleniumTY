package com.pomrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage {
	
	public ShoppingCartPage(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="CountryId")
	private WebElement SelectCountryListBox;
	
	@FindBy(id="termsofservice")
	private WebElement TermsOfService;
	
	@FindBy(id="checkout")
	private WebElement CheckOutButton;
	
	@FindBy(xpath="//a[text()='Build your own cheap computer']/../../td[1]//input")
	private WebElement CheckBox;
	
	public void selectCountry(String country)
	{
		Select s=new Select(SelectCountryListBox);
		s.selectByVisibleText(country);
	}
	
	public void AcceptTermsOfService()
	{
		TermsOfService.click();
	}
	public void ClickCheckOutButton()
	{
		CheckOutButton.click();
	}
	
	public void clickCheckBox()
	{
		CheckBox.click();
	}
	public WebElement getSelectCountryListBox() {
		return SelectCountryListBox;
	}

	public WebElement getTermsOfService() {
		return TermsOfService;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}
	
	public void removeItem(WebDriver driver,String ItemName)
	{
		WebElement item = driver.findElement(By.xpath("(//a[text()='"+ItemName+"'])[2]/../..//input"));
		item.click();
	}
}
