package MainProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GearFunctionality {
	public WebDriver driver;
	public GearFunctionality(WebDriver driver)
  {
	this.driver=driver;
  }
	By gearClk=By.xpath("//*[@id=\"ui-id-6\"]");
	By bagclk=By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/a/span/span/img");
	By qty=By.xpath("//*[@id=\"qty\"]");
	By addCart=By.xpath("//*[@id=\"product-addtocart-button\"]");
	By link=By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a");
	By edit=By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[2]/td/div/a[2]");
	By update=By.xpath("//*[@id=\"product-updatecart-button\"]");
	By checkout=By.xpath("//span[text()='Proceed to Checkout']");
	
	public void bag() throws InterruptedException
	{
		driver.findElement(gearClk).click();
		driver.findElement(bagclk).click();
		driver.findElement(qty).sendKeys(Keys.DELETE);
		driver.findElement(qty).sendKeys("2");
		driver.findElement(addCart).click();
		driver.findElement(link).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(edit).click();
		driver.findElement(update).click();
		//driver.findElement(checkout).click();
		Thread.sleep(2000);
	}
}
