package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RegisterLoginPage22 {
	public WebDriver driver;
	public RegisterLoginPage22(WebDriver driver)
{
	this.driver=driver;
}
	By Clickonlogin=By.linkText("Log in");
	By username=By.id("Email");
	By paswrd=By.id("Password");
    By login=By.xpath("//input[@class='button-1 login-button']");
    By Clickonlogout=By.linkText("Log out");
    
    public void enterurl()
    {
    	driver.get("https://demowebshop.tricentis.com/login");
    }
    public void login1()
    {
    	driver.findElement(Clickonlogin).click();
    }
    public void login2(String un,String pass)
    {
    	driver.findElement(username).sendKeys(un);
    	driver.findElement(paswrd).sendKeys(pass);
    }
    public void clicklogin()
    {
    	driver.findElement(login).click();
    	driver.findElement(Clickonlogout).click();
    }
  //  public void clicklogout()
   // {
  //  	driver.findElement(Clickonlogout).click();
  //  }
}
