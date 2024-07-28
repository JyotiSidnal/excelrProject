package KeywordDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectClass {
	public WebDriver driver;
	
	public void enterurl() throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		Thread.sleep(20000);
	}
	public void enterUser(String un)
	{
		driver.findElement(By.id("user-name")).sendKeys(un);
	}
	public void enterPass(String pass)
	{
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	public void clickLogin()
	{
		driver.findElement(By.id("login-button")).click();
	}

}
