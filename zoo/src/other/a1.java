package other;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class a1 
{
	public static String username(int i, int j) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\cujwa\\OneDrive\\Desktop\\prc.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet2");
		String q1 = sheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(q1+" ");

		return q1;
	}
	
	
	
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\cujwa\\OneDrive\\Desktop\\prc.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet2");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		
		for(int n=0; n<rowcount; n++)
		{
			for(int m=0; m<1; m++)
			{
				a1.username(n, m);
			}
			System.out.println();

		}
		
		for(int n=0; n<rowcount; n++)
		{
			for(int m=1; m<colcount; m++)
			{
				a1.username(n, m);
			}
			System.out.println();

		}
		


	}
}
