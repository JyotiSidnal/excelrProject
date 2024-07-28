package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SourceDemoLoginPageFactory {
	public WebDriver driver;
	public SourceDemoLoginPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="user-name") WebElement userName;
	@FindBy(id="password") WebElement passname;
	@FindBy(id="login-button") WebElement login;
	
	public void enterurl()
	{
		driver.get("https://www.saucedemo.com/v1/index.html");
	}
	public void login(String un,String pass)
	{
		userName.sendKeys(un);
		passname.sendKeys(pass);
		login.click();
	}

}
