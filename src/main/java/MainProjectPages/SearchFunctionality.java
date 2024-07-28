package MainProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchFunctionality {
	public WebDriver driver;
	public SearchFunctionality(WebDriver driver)
  {
	this.driver=driver;
  }
By search=By.xpath("//input[@id='search']");
//By SearchClk=By.xpath("//button[@type='submit' and @title='Search']");
By selecBy=By.xpath("//*[@id=\"sorter\"]");
By verofyDress=By.linkText("Maxima Drawstring Short");
By size=By.xpath("//div[@id='option-label-size-143-item-172']");
By color=By.xpath("//div[@id='option-label-color-93-item-52']");
By addcart=By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[2]/div/div/div[4]/div/div[1]/form/button/span");


public void search() throws InterruptedException
{
	driver.findElement(search).sendKeys("women dresses");
	//driver.findElement(SearchClk).click();
	Thread.sleep(2000);
	driver.findElement(search).sendKeys(Keys.ENTER);
	driver.findElement(selecBy).click();
	WebElement ss=driver.findElement(selecBy);
	Select s=new Select(ss);
	s.selectByIndex(1);
	Thread.sleep(2000);
	String expected="Maxima Drawstring Short";
    String	actual=driver.findElement(verofyDress).getText();
    System.out.println(actual);
    if(expected.equals(actual))
    {
    	System.out.println("pass");
    }
    else
    {
    	System.out.println("fail");
    }
    driver.findElement(size).click();
    driver.findElement(color).click();
    driver.findElement(addcart).click();

			
}
}
