package src.com.sauceDemo.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import src.com.sauceDemo.Test.TestBase;

public class excel extends TestBase
{
	
	public static String excelip(int i, int j) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\cujwa\\OneDrive\\Desktop\\prc.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		String q1 = sheet.getRow(i).getCell(j).getStringCellValue();
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
//		for(int k=0; k<rowcount; k++)
//		{
//			XSSFRow currentRow = sheet.getRow(k);
//			
//			for(int d=0; d<colcount; d++)
//			{
//				  String q2 = currentRow.getCell(d).toString();
//			}
//		}
//		
	//	return q1;
		return null;
	}
	
	public static void sc(String a) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+a+".jpg");
		FileHandler.copy(src,dest);
	}
	

}
