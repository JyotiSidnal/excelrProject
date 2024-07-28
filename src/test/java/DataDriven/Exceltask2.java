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
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Exceltask2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver2= new FirefoxDriver();	
		driver2.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String path="C:\\Users\\Jyothi\\Desktop\\TEstData.xlsx";
		FileInputStream path1=new FileInputStream(path);
		XSSFWorkbook open=new XSSFWorkbook(path1);
		XSSFSheet sheet= open.getSheet("Sheet1");	
		int rows=sheet.getLastRowNum();
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			XSSFCell username=row.getCell(0);
			XSSFCell password=row.getCell(1);
			System.out.println(username+" "+password);
			driver2.findElement(By.name("username")).sendKeys(username.toString());
			driver2.findElement(By.name("password")).sendKeys(password.toString());
			driver2.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
			
		}	

	}

}
