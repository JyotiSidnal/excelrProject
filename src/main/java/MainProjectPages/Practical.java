package MainProjectPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practical {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.get("https://magento.softwaretestingboard.com/checkout/#shipping");
        driver.findElement(By.xpath("//*[@id=\"customer-email\"]")).sendKeys("abc");

        try {
            driver.get("https://magento.softwaretestingboard.com/");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
	}

