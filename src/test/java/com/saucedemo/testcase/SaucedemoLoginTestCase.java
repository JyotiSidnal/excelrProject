package com.saucedemo.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.saucedemo.pages.SourceDemoLoginPageFactory;
import com.saucedemo.pages.SourceDemoLogout;

public class SaucedemoLoginTestCase {

	
		@Test
		public void login()
		{
			
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//SaucedemoLoginPagee lp=new SaucedemoLoginPagee(driver);
		//lp.enterUrl();
		//lp.enterUsername("standard_user");
	//	lp.entrePassword("secret_sauce");
		//lp.clickOnLogin();
		SourceDemoLoginPageFactory lpf=new SourceDemoLoginPageFactory(driver);
		SourceDemoLogout lg=new SourceDemoLogout(driver);
		lpf.enterurl();
		lpf.login("standard_user", "secret_sauce");
		lg.clickMenue();
		lg.logout();
		System.out.println("successfully loggedout");
		
	}

}
