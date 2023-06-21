package com.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TCPCoachingDayPage {

	public TCPCoachingDayPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@value='Add to compare list']")
	private WebElement AddToCompareListButton;
	
	public void clickAddToCompareListButton()
	{
		AddToCompareListButton.click();
	}

	public WebElement getAddToCompareListButton() {
		return AddToCompareListButton;
	}
}
