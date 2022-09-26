package Aut_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAutomation {

	public static void main(String[] args) throws IOException {
		File file=new File("FilesImg//TestSuit.xlsx");
		String FPath=file.getAbsolutePath();
		FileInputStream fis = new FileInputStream(FPath);// for reading mode to open the file		
		
		XSSFWorkbook wbook=new XSSFWorkbook(fis);
 		int sheetcnt=wbook.getNumberOfSheets();
		System.out.println("Count of sheet-- "+sheetcnt);
		XSSFSheet wsheet = wbook.getSheet("TestData");
		XSSFRow rowObj=wsheet.getRow(2);
		XSSFCell cellobj=rowObj.getCell(2);
		String v=cellobj.getStringCellValue();
		System.out.println(v);
		
		
		
	}

}
