package AssDatadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		FileInputStream path=new FileInputStream("C:\\Users\\Jyothi\\Desktop\\TEstData.xlsx");
		XSSFWorkbook open=new XSSFWorkbook(path);
		XSSFSheet sheet=open.getSheet("Sheet2");
		int rows=sheet.getLastRowNum();
		for(int r=1;r<=rows;r++)
		{
		XSSFRow r1=sheet.getRow(r);
		XSSFCell cell=r1.getCell(0);
		XSSFCell cell1=r1.getCell(1);
		driver.findElement(By.name("uid")).sendKeys(cell.toString());
		driver.findElement(By.name("password")).sendKeys(cell1.toString());
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
		System.out.println("logged in successfully");

	}
	}
}
