package com.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement WishlistLink;
	
	@FindBy(id="small-searchterms")
	private WebElement SearchTextField;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement SearchButton;
	
	@FindBy(partialLinkText = "Books")
	private WebElement books;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement Computers;
	
	@FindBy(id = "newsletter-email")
	private WebElement SubscribeTextFiled;
	
	@FindBy(id = "newsletter-subscribe-button")
	private WebElement SubscribeButton;
	
	@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	private WebElement ComputersTab;
	
	public void clickLogin()
	{
		loginLink.click();
	}
	
	public void clickRegister()
	{
	    registerLink.click();
	}
	
	public void clickShoppingCart()
	{
	    shoppingCartLink.click();
	}
	public void clickWishlist()
	{
	    WishlistLink.click();
	}
	public void search(String item)
	{
	    SearchTextField.sendKeys(item);
	}
	public void clickSearchButton()
	{
	   SearchButton.click();
	}
	
	public void clickBooks()
	{
		books.click();
	}
	
	public void clickComputers()
	{
		Computers.click();
	}
	
	public void subscribe(String mail)
	{
		SubscribeTextFiled.sendKeys(mail);
	}
	
	public void clickSubscribeButton()
	{
		SubscribeButton.click();
	}
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getSearchTextField() {
		return SearchTextField;
	}

	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public void setShoppingCartLink(WebElement shoppingCartLink) {
		this.shoppingCartLink = shoppingCartLink;
	}
	
	public WebElement getWishlistLink() {
		return WishlistLink;
	}
	
	public WebElement getSearchButton() {
		return SearchButton;
	}
	
	public WebElement getBooks() {
		return books;
	}

	public WebElement getSubscribeTextFiled() {
		return SubscribeTextFiled;
	}

	public WebElement getSubscribeButton() {
		return SubscribeButton;
	}

	public WebElement getComputers() {
		return Computers;
	}
}
