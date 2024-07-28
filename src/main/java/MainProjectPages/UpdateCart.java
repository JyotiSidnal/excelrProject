package MainProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateCart {
	public WebDriver driver;
	public UpdateCart(WebDriver driver)
  {
	this.driver=driver;
  }
By delete=By.xpath("/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[5]/div/a/span");
By update=By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[2]/td/div/a[2]");
By qty=By.xpath("//*[@id=\"cart-209363-qty\"]");

public void deletes() throws InterruptedException
{
	driver.findElement(delete).click();
	//driver.findElement(update).click();
	Thread.sleep(2000);
	WebElement clear=driver.findElement(qty);
	clear.clear();
	Thread.sleep(1000);
	clear.sendKeys("2");
}
}
