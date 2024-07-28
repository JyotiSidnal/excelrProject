package MainProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Comparison {
	public WebDriver driver;
	public Comparison(WebDriver driver)
  {
	this.driver=driver;
  }
	By whatsnewClk=By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[1]/a/span");
	By bags=By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/a/span/span/img");
//	By compare=By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[5]/div/a[2]");
//	By link=By.linkText("comparison list");
	By price=By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[3]/div[1]/span/span/span");
	By rateclk=By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[2]/div[2]/a[2]");
	By ratings=By.xpath("//*[@id=\"Rating_4_label\"]");
	By name=By.xpath("//input[@id='nickname_field']");
	By summary=By.xpath("//input[@id='summary_field']");
	By review=By.xpath("//textarea[@id='review_field']");
	By submit=By.xpath("//span[text()='Submit Review']");
	
	public void comparisons() throws InterruptedException
	{
		driver.findElement(whatsnewClk).click();
		driver.findElement(bags).click();
		Thread.sleep(2000);
		String expected="$45.00";				
		String actual=driver.findElement(price).getText();
		if(expected.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.findElement(rateclk).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(ratings).click();
		driver.findElement(name).sendKeys("abac");
		driver.findElement(summary).sendKeys("Product is good");
		driver.findElement(review).sendKeys("Good");
		driver.findElement(submit).click();


	}
	
}
