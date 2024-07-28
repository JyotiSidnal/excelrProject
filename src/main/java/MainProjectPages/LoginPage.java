package MainProjectPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
  {
	this.driver=driver;
  }
 By createaccount= By.linkText("Create an Account");
 By username= By.id("firstname");
 By lastname=By.id("lastname");
 By email=By.name("email");
 By paswrd=By.name("password");
 By cppswrd=By.name("password_confirmation");
 By click=By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"); 
 By SignUps= By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
 By un=By.name("login[username]");
 By pw=By.name("login[password]");
 By signup=By.linkText("Sign In");
 public void openApplication()
 {
	 
	 driver.manage().window().maximize();
	 driver.get("https://magento.softwaretestingboard.com/");
	 driver.findElement(createaccount).click();
 }
 public void openSignup()
 {
	 
	 driver.manage().window().maximize();
	 driver.get("https://magento.softwaretestingboard.com/");
	 driver.findElement(SignUps).click();
	 driver.findElement(un).sendKeys("laxmiPB@gmail.com");
	 driver.findElement(pw).sendKeys("Abc@123456");
	 driver.findElement(signup).click();
 }
 public void createAccount() throws InterruptedException
 {
	 driver.findElement(username).sendKeys("Laxmi");
	 driver.findElement(lastname).sendKeys("Patil");
	
	 driver.findElement(email).sendKeys("laxmiPB@gmail.com");
	 driver.findElement(paswrd).sendKeys("Abc@123456");
	 driver.findElement(cppswrd).sendKeys("Abc@123456");
	 
	 driver.findElement(click).click();
 }
}
