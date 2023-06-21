package com.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotebookPage {
	public NotebookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(linkText = "14.1-inch Laptop")
	private WebElement OneInchLaptopLink;
	
	@FindBy(xpath= "//a[text()='14.1-inch Laptop']/../..//input")
	private WebElement AddToCartButton;
	
	public void clickOneInchLaptopLink()
	{
		OneInchLaptopLink.click();
	}
	
	public void clickAddToCartButton()
	{
		AddToCartButton.click();
	}

	public WebElement getOneInchLaptopLink() {
		return OneInchLaptopLink;
	}

	public WebElement getAddToCartButton() {
		return AddToCartButton;
	}
	
	
}
