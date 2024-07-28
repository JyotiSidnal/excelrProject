package KeywordDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeywordDrivenPractice {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new FirefoxDriver();
		ObjectClass oc=new ObjectClass();
		FileInputStream path=new FileInputStream("C:\\Users\\Jyothi\\Desktop\\TEstData.xlsx");
		XSSFWorkbook open=new XSSFWorkbook(path);
		XSSFSheet sheet=open.getSheet("Keyword");
	     int lastrow=sheet.getLastRowNum();
	     for(int r=1;r<=lastrow;r++)
	     {
	    	 XSSFRow row=sheet.getRow(r);
	    	 XSSFCell methods=row.getCell(0);
	    	 XSSFCell Keys=row.getCell(1);
	    	 System.out.println(methods+"==>"+Keys);
	    	 
	    	 switch(Keys.toString()) {
	        	case "url":
	        		oc.enterurl();
	        		break;
	        	case "username":
	        		oc.enterUser("problem_user");
	        		break;	
	        	case "password":
	        		oc.enterPass("secret_sauce");
	        		break;
	        	case "login":
	        		oc.clickLogin();
	        		break;
	     }
		
	
	}

	}
}
