import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelAutomation {
	
	@Test
	public void readData() throws IOException {
		File file=new File("src\\main\\resources\\DataFilles\\TestSuit.xlsx");
		String FPath=file.getAbsolutePath();
		FileInputStream fis = new FileInputStream(FPath);// for reading mode to open the file		
		
		
		XSSFWorkbook wbook=new XSSFWorkbook(fis);
 		int sheetcnt=wbook.getNumberOfSheets();
 		for(int t=0;t<sheetcnt;t++) {
 			String sheetName=wbook.getSheetName(t);
 	
		System.out.println("Count of sheet-- "+sheetcnt);
		XSSFSheet wsheet = wbook.getSheet(sheetName);
	
		int rnum=wsheet.getLastRowNum();
		System.out.println("TTT--"+rnum);
		for(int i=0; i<=rnum;i++) {
			XSSFRow rwobj=wsheet.getRow(i);
			int clmcnt=rwobj.getLastCellNum();
			for(int j=0;j<clmcnt;j++) {
				XSSFCell cellobj=rwobj.getCell(j);
				String v=cellobj.getStringCellValue();
				if (v.equalsIgnoreCase("sandeep") | v.equalsIgnoreCase("hello")) {
					System.out.println(v+" in the sheet-"+sheetName+" Row num- "+(i+1)+" and column num is- "+(j+1));	
				}
				
			}
			
		}
		System.out.println("Test Data Has been read of sheet-- "+sheetName);
 		}	
	}

}
