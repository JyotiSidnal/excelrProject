package KeywordDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.saucedemo.pages.SaucedemoLoginPagee;
import com.saucedemo.pages.SourceDemoLogout;

public class KeyWordTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new FirefoxDriver();	
		SourceDemoLogout lg=new SourceDemoLogout(driver);
		SaucedemoLoginPagee lp=new SaucedemoLoginPagee(driver);
		String path="C:\\Users\\Jyothi\\Desktop\\TEstData.xlsx";
		FileInputStream path1=new FileInputStream(path);
		XSSFWorkbook open=new XSSFWorkbook(path1);
		XSSFSheet sheet= open.getSheet("Keyword");	
		int rows=sheet.getLastRowNum();
        for(int r=1;r<=rows;r++)
        {
        	XSSFRow row=sheet.getRow(r);
        	XSSFCell methods=row.getCell(0);
        	XSSFCell Keys=row.getCell(1);
        	System.out.println(methods+"==>"+Keys);
        	
        	switch(Keys.toString()) {
        	case "url":
        		lp.enterUrl();
        		break;
        	case "username":
        		lp.enterUsername("problem_user");
        		break;
        	case "password":
        		lp.entrePassword("secret_sauce");
        		break;
        	case "login":
        		lp.clickOnLogin();
        		break;
        	case "menue":
        		lg.clickMenue();
        		break;
        	case "lgout":
        		lg.logout();
        		break;
        	}
        	
        }
	}

}
