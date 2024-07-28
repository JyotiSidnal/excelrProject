package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SourceDemoLogout {
	public WebDriver driver;
	public SourceDemoLogout(WebDriver driver)
	{
		this.driver=driver;
	}
	//repository for elements present on the login web page
	By menue=By.xpath("/html/body/div/div[1]/div/div[3]/div/button");
    By logout=By.id("logout_sidebar_link");
    
    public void clickMenue()
    {
    	driver.findElement(menue).click();
    }
    public void logout()
    {
    	driver.findElement(logout).click();
    }
}
