package com.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage {
    WebDriver driver1;
  
	public BuildYourOwnComputerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	@FindBy(xpath="//label[contains(text(),'HDD')]/../../dd[3]//input[1]")
	private WebElement HddRadio;
	
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	private WebElement AddToCartButton;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement ShoppingCartLink;
	
	
    public String getTitle()
    {
    	return driver1.getTitle();
    }
	public void selectHdd()
	{
		HddRadio.click();
	}
	public void clickAddToCartButton()
	{
		AddToCartButton.click();
	}
	public void clickShoppingCartLink()
	{
		ShoppingCartLink.click();
	}
	
}
