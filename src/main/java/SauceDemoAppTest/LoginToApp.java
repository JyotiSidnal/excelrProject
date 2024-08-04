package SauceDemoAppTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class LoginToApp {
	WebDriver driver;
	//TakesScreenshot ts= (TakesScreenshot)driver;
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Brwoser launched");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@Test(priority=1,dataProvider="dataset")
	public void login(String un,String psw) throws InterruptedException, IOException
	{
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(psw);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File target=new File(".//screenshots//Demo3.png");
//		Files.copy(src,target);
//		System.out.println("pass");
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		driver.findElement(By.linkText("Logout")).click();
		//driver.navigate().refresh();
	}
	@DataProvider(name="dataset")
	public Object[][] method(){
		return new Object[][] {
			{"standard_user","secret_sauce"},
			//{"locked_out_user","secret_sauce"},
//			{"problem_user","secret_sauce"},
//	     	{"performance_glitch_user","secret_sauce"},
//			{"error_user","secret_sauce"},
		};
	}
	@Test(priority=2)
	public void addCart() throws InterruptedException
	{
		System.out.println("add product to cart");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
//		String title=driver.getTitle();
//		System.out.println(title);
//		String expected="Sauce Labs Backpack";
//		String actual=driver.findElement(By.linkText("Sauce Labs Backpack")).getText();
//		Assert.assertEquals(expected, actual);
//		System.out.println("Pass");
//		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
	}
	@Test(priority=3,enabled=false)
	public void CheckOut()
	{
		driver.findElement(By.id("first-name")).sendKeys("Jyoti");
		driver.findElement(By.id("last-name")).sendKeys("Sidnal");
		driver.findElement(By.id("postal-code")).sendKeys("591233");
		driver.findElement(By.id("continue")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("finish")).click();
		String expected1="Thank you for your order!";
		String actual2=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/h2")).getText();
		System.out.println(actual2);
		Assert.assertEquals(expected1, actual2);
		System.out.println("Pass");
		//driver.findElement(By.id("back-to-products")).click();				
	}

}
