package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeCode {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		FileInputStream path=new FileInputStream("C:\\Users\\Jyothi\\Desktop\\TEstData.xlsx");
		XSSFWorkbook open=new XSSFWorkbook(path);
		XSSFSheet sheet= open.getSheet("Sheet1");
		int lastRow=sheet.getLastRowNum();
		for(int r=1;r<=lastRow;r++)
	{
		try {	XSSFRow row=sheet.getRow(r);
			XSSFCell username=row.getCell(0);
			XSSFCell password=row.getCell(1);
			System.out.println(username+"===>"+password);
			driver.findElement(By.id("user-name")).sendKeys(username.toString());
			driver.findElement(By.id("password")).sendKeys(password.toString());
			Thread.sleep(1000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
			driver.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(1000);
			System.out.println("valid");
			}catch(Exception e) {
			System.out.println("invalid");
				
			}
	}
	

	}
	}
