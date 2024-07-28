package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\Jyothi\\Desktop\\TEstData.xlsx";
		FileInputStream path1=new FileInputStream(path);
		XSSFWorkbook open=new XSSFWorkbook(path1);
		XSSFSheet sheet= open.getSheet("Sheet1");	
	    XSSFRow row = sheet.getRow(1);
	    XSSFCell col=row.getCell(1);
	   String col1=row.getCell(1).getStringCellValue();
	   System.out.println(col1);
	   String str1=col.getStringCellValue();
	   System.out.println(str1);
	    
	    
		
		
		
		}

}
