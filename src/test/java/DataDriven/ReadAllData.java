package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {

	public static void main(String[] args) throws IOException {
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
			
		}
		
		
		
		}
	}


