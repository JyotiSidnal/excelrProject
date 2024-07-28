package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaucedemoLoginPagee {
	public WebDriver driver;
	public SaucedemoLoginPagee(WebDriver driver)
	{
		this.driver=driver;
	}
	//repository for elements present on the login web page
	By usernameTextBox=By.id("user-name");
	By passTextBox=By.id("password");
	By loginBtn=By.id("login-button");
	
	
	public void enterUrl() throws InterruptedException {
		driver.get("https://www.saucedemo.com/v1/index.html");
		Thread.sleep(20000);
	}
	public void enterUsername(String un)
	{
		driver.findElement(usernameTextBox).sendKeys(un);
	}
	public void entrePassword(String pass)
	{
		driver.findElement(passTextBox).sendKeys(pass);
	}
public void clickOnLogin()
{
	driver.findElement(loginBtn).click();
}
}
