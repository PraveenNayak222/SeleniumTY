package com.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage {
	public ComputersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[contains(text(),'Desktops')])[4]")
	private WebElement DesktopsLink;
	
	@FindBy(xpath="(//a[contains(text(),'Notebooks')])[4]")
	private WebElement NotebooksLink;
	
	@FindBy(xpath="(//a[contains(text(),'Accessories')])[4]")
	private WebElement AccessoriesLink;
	
	public void clickDesktopsLink()
	{
		DesktopsLink.click();
	}
	public void clickNotebooksLink()
	{
		NotebooksLink.click();
	}
	
	public void clickAccessoriesLink()
	{
		AccessoriesLink.click();
	}
	
	
	

}
