package ExcelReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldataByIndex {
	
	public static void main(String[]args) throws IOException, InterruptedException{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\USER-PC\\Documents\\GitHub\\SeleniumJavaBasics\\Selenium\\src\\ExcelReading\\TestData.xlsx");
		 XSSFWorkbook Book=new XSSFWorkbook(fis);
		 XSSFSheet sheet=Book.getSheet("Logins");
		 XSSFRow row=sheet.getRow(3);
		 XSSFCell cell=row.getCell(1);
		 
		 String value=cell.getStringCellValue();
		 
		 Thread.sleep(2000);
		 
		 System.out.println("Value of excel value= "+value);
		 
		 ReadExceldataByIndex RD=new ReadExceldataByIndex();
		 RD.ReadExcelByName();
		 
		 
	}
	
	public void ReadExcelByName() throws IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\USER-PC\\Documents\\GitHub\\SeleniumJavaBasics\\Selenium\\src\\ExcelReading\\TestData.xlsx");
		 XSSFWorkbook Book=new XSSFWorkbook(fis);
		 XSSFSheet sheet=Book.getSheet("Logins");
		 XSSFRow row=sheet.getRow(0);
		 XSSFCell cell=null;
		 
		 int colNum=2 ;
		 /*for (int i = 0; i < row.getLastCellNum(); i++) {
			 if(row.getCell(i).getStringCellValue().equals(""));
			 colNum=i;	
		}*/
		 row=sheet.getRow(2);
		 cell=row.getCell(colNum);
		 
		 String Password= cell.getStringCellValue();
		 System.out.println("Value of excel read by Name= "+Password);
		
	}

}
