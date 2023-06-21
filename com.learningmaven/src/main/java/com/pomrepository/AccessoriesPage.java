package com.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessoriesPage {
	public AccessoriesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy
	private WebElement TcpCoachingDayLink;
	
	public void clickTcpCoachingDayLink()
	{
		TcpCoachingDayLink.click();
	}

	public WebElement getTcpCoachingDayLink() {
		return TcpCoachingDayLink;
	}
}
