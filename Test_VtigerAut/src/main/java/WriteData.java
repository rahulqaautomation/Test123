import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteData {
    @Test
	public void Test_Write() throws IOException {
		File file=new File("src\\main\\resources\\DataFilles\\TestSuit_Write.xlsx");
		String FPath=file.getAbsolutePath();
				
		FileInputStream fis = new FileInputStream(FPath);
		
		XSSFWorkbook wbook=new XSSFWorkbook(fis);
		XSSFSheet sheetobj=wbook.getSheet("Sheet1");
		int rnum=sheetobj.getLastRowNum();
		XSSFRow rowObj = sheetobj.createRow(rnum+1);
		XSSFCell cellobj = rowObj.createCell(0);
		cellobj.setCellValue("Test12tt3");
		
		FileOutputStream fos = new FileOutputStream(FPath);
		wbook.write(fos);
		wbook.close();
		
		
		
		
	}
	
	
}
