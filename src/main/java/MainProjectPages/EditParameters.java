package MainProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditParameters {
	
	public WebDriver driver;
	public EditParameters(WebDriver driver)
  {
	this.driver=driver;
  }
	
	
	By edit=By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[2]/td/div/a[2]");
	By size=By.xpath("//*[@id=\"option-label-size-143-item-169\"]");
	By colors=By.xpath("//*[@id=\"option-label-color-93-item-56\"]");
	By update=By.xpath("//*[@id=\"product-updatecart-button\"]");
	By text=By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div");
	
	
	public void updates() throws InterruptedException
	{
		driver.findElement(edit).click();
		Thread.sleep(2000);
		driver.findElement(size).click();
		driver.findElement(colors).click();
		driver.findElement(update).click();
		WebElement text1=driver.findElement(text);
		String actual=text1.getText();
		String expected="Radiant Tee was updated in your shopping cart.";
		if(actual.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
