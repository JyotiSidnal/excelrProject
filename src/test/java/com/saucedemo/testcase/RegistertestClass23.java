package com.saucedemo.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.saucedemo.pages.RegisterLoginPage;
import com.saucedemo.pages.RegisterPageFactory;

public class RegistertestClass23 {

		@Test
		public void login()
		{
			
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//RegisterLoginPage lpa=new RegisterLoginPage(driver);
		RegisterPageFactory as=new RegisterPageFactory(driver);
		//lpa.enterurl();
		//lpa.login1();
		//lpa.login2("jyosidnal@gmail.com", "Jyoti@123");
		//lpa.clicklogin();
		//lpa.clicklogout();
		//lpa.login1();
		//lpa.login2("jyosidnal@gmail.com", "Jyoti@123");
		//lpa.clicklogin();
		as.enterurl();
		as.login("jyosidnal@gmail.com", "Jyoti@123");
	}

}
