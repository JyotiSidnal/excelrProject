package MainProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addcart {
	public WebDriver driver;
	public Addcart(WebDriver driver)
  {
	this.driver=driver;
  }
	By clk=By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[2]/a/span[2]");
	By size=By.id("option-label-size-143-item-166");
	By color=By.id("option-label-color-93-item-50");
	By cart=By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/div[4]/div/div[1]/form/button/span");
	By link=By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div/a");
	By btn=By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");//*[@id="maincontent"]/div[3]/div/div[2]/div[1]/ul/li[1]/button
	By btn1=By.xpath("//*[@id=\"top-cart-btn-checkout\"]");
	
	
	
	public void carts()
	{
		driver.findElement(clk).click();
		driver.findElement(size).click();
		driver.findElement(color).click();
		driver.findElement(cart).click();
	}
	public void check()
	
	{
		driver.findElement(link).click();
		boolean tr=driver.findElement(btn).isDisplayed();
		if(tr==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		//driver.findElement(btn).click();
	}
	public void clkick() throws InterruptedException
	{
		driver.findElement(btn).click();
//		Thread.sleep(2000);
//		driver.findElement(btn1).click();
//		
		
	}
}
