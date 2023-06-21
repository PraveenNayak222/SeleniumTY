package com.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesktopPage {
	
	//WebDriver driver1;
	public DesktopPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//driver1=driver;
	}

	@FindBy(id="products-orderby")
	private WebElement SortByDropdown;
	
	@FindBy(id="products-pagesize")
	private WebElement DisplayDropdown;
	
	@FindBy(id="products-viewmode")
	private WebElement ViewAsDropdown;
	
	@FindBy(xpath="//a[text()='Build your own computer']")
	private WebElement BuildYourOwnComputerLink; 
	
	@FindBy(xpath="(//a[text()='Build your own cheap computer'])[2]/../..//input")
	private WebElement AddToCartCheapComputer;
	
	@FindBy(xpath="(//a[text()='Build your own computer'])/../..//input")
	private WebElement AddToCartOwnComputer;
	
	@FindBy(xpath="(//a[text()='Build your own expensive computer'])/../..//input")
	private WebElement AddToCartExpensiveComputer;
	
	@FindBy(xpath="(//a[text()='Simple Computer'])/../..//input")
	private WebElement AddToCartSimpleComputer;
	
	@FindBy(xpath="//a[contains(text(),'Under')]")
	private WebElement FilterByPriceUnder1000;
	
	@FindBy(linkText ="Remove Filter")
	private WebElement RemoveFilterLink;
	
	@FindBy(xpath="//a[text()='Elite Desktop PC']")
	private WebElement EliteDesktopPCLink;
	
	public void clickAddToCartCheapComputer()
	{
		AddToCartCheapComputer.click();	
	}
	public void clickAddToCartOwnComputer()
	{
		AddToCartOwnComputer.click();	
	}
	public void clickAddToCartExpensiveComputer()
	{
		AddToCartExpensiveComputer.click();	
	}
	public void clickAddToCartSimpleComputer()
	{
		AddToCartSimpleComputer.click();	
	}
	
	public void clickBuildYourOwnComputerLink()
	{
		//WebDriverWait wait=new WebDriverWait(driver1,30);
		//wait.until(ExpectedConditions.visibilityOf(BuildYourOwnComputerLink));
		BuildYourOwnComputerLink.click();
	}
	
	public void sortByNameAsc(String text)
	{
	  Select s=new Select(SortByDropdown);	
	  s.selectByVisibleText(text);
	}
	
	public void displayPerPage(String text)
	{
		Select s=new Select(DisplayDropdown);	
		s.selectByVisibleText(text);	
	}
	
	public void viewAs(String text)
	{
		Select s=new Select(ViewAsDropdown);	
		s.selectByVisibleText(text);	
	}
	
	public void clickremoveFilter()
	{
	   RemoveFilterLink.click();
	}
	
	public void filterByPriceUnder1000()
	{
	   FilterByPriceUnder1000.click();	
	}
	
	public void clickEliteDesktopPCLink()
	{
	  EliteDesktopPCLink.click();
	}
	public WebElement getSortByDropdown() {
		return SortByDropdown;
	}
	public WebElement getDisplayDropdown() {
		return DisplayDropdown;
	}
	public WebElement getViewAsDropdown() {
		return ViewAsDropdown;
	}
	public WebElement getAddToCartCheapComputer() {
		return AddToCartCheapComputer;
	}
	public WebElement getAddToCartOwnComputer() {
		return AddToCartOwnComputer;
	}
	public WebElement getAddToCartExpensiveComputer() {
		return AddToCartExpensiveComputer;
	}
	public WebElement getAddToCartSimpleComputer() {
		return AddToCartSimpleComputer;
	}
}
