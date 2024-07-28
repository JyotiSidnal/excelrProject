package MainProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Order {
	public WebDriver driver;
	public Order(WebDriver driver)
  {
	this.driver=driver;
  }
	By email2=By.xpath("//*[@id=\"customer-email\"]");
	By pw2=By.xpath("//*[@id=\"customer-password\"]");
	By login1=By.xpath("//*[@id=\"customer-email-fieldset\"]/fieldset/div[2]/div[1]/button");
	By FN =By.xpath("//*[@id=\"W99U51P\"]");//*[@id="O8V3CR1"]
	By LN =By.xpath("//*[@id=\"L0LDA64\"]");//*[@id="VMVUDFT"]
	By CN =By.xpath("//*[@id=\"O8V3CR1\"]");
	By AN =By.xpath("//*[@id=\"VMVUDFT\"]");//*[@id="GM28TOF"]
	By ACCN =By.xpath("//*[@id=\"GM28TOF\"]");
	By SDD=By.xpath("//*[@id=\"NMVQ9NB\"]");
	By ZC=By.xpath("//*[@id=\"YJA952G\"]");
	By CD=By.xpath("//*[@id=\"GEKB3V8\"]");
	By PN=By.xpath("//*[@id=\"RWPMB26\"]");
	By radio=By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[2]/td[1]/input");
	By next=By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button");
	By place=By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button/span");
	
	public void ordeItem()
	{
		driver.findElement(email2).sendKeys("laxmiPB@gmail.com");
		driver.findElement(pw2).sendKeys("Abc@123456");
		driver.findElement(login1).click();
		driver.findElement(FN).sendKeys("Jyoti");
		driver.findElement(LN).sendKeys("Sidnal");
		driver.findElement(CN).sendKeys("NTT");
		driver.findElement(AN).sendKeys("Gokak");
		driver.findElement(ACCN).sendKeys("Belgaum");
		WebElement ele=driver.findElement(SDD);
		Select s= new Select(ele);
		s.deselectByVisibleText("Alaska");
		driver.findElement(ZC).sendKeys("123");
		WebElement ele2=driver.findElement(CD);
		Select s2= new Select(ele2);
		s2.deselectByVisibleText("India");
		driver.findElement(PN).sendKeys("897445677");
		driver.findElement(radio).click();
		driver.findElement(next).click();
		driver.findElement(place).click();
		
		
	}
}
