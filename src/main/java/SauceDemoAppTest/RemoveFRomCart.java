package SauceDemoAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RemoveFRomCart {
	public WebDriver driver;

	@Test(priority=4)
	public void Remove() throws InterruptedException
	{
		System.out.println("remove from product to cart");
		driver.findElement(By.linkText("Remove")).click();//*[@id="remove"]
		Thread.sleep(5000);
		System.out.println("remove from product to cart");
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	}

}
