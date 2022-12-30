package Animal;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class w1
{

	public static String excel(int i, int j) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\cujwa\\OneDrive\\Desktop\\prc.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		String q1 = sheet.getRow(i).getCell(j).getStringCellValue();
//		int rowcount = sheet.getLastRowNum();
//		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.print(q1+" ");

		return q1;
		//return null;


	}

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\cujwa\\OneDrive\\Desktop\\prc.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int n=0; n<rowcount; n++)
		{
			for(int m=0; m<colcount; m++)
			{
				String q1 = w1.excel(n, m);
			}
			System.out.println();

		}


	}
}






