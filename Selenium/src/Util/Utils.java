package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utils {

	public static String Sheet_path="C:\\Users\\USER-PC\\workspace\\Selenium\\src\\Util\\Lgin data.xlsx";
	 static Workbook book;
	 static org.apache.poi.ss.usermodel.Sheet sheet;
	public static Object[][] getTestdata(String sheetname) throws Throwable{
		FileInputStream file=null;
		try {
			file=new FileInputStream(Sheet_path);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
			
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet= book.getSheet(sheetname);
		Object[][]data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];	
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j]=sheet.getRow(i+1).toString();
				
			}
			
		}return data;
	}
}

