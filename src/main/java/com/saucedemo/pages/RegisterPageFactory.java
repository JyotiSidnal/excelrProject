package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageFactory {
	public WebDriver driver;
	public RegisterPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Log in") WebElement login1;
	@FindBy(id="Email") WebElement email1;
	@FindBy(id="Password") WebElement passwrd;
	@FindBy(xpath="//input[@class='button-1 login-button']") WebElement click;
	

	public void enterurl()
	{
		driver.get("https://demowebshop.tricentis.com/login");
	}
	public void login(String un,String pass)
	{
		login1.click();
		email1.sendKeys(un);
		passwrd.sendKeys(pass);
		click.click();
	}
	

}
