import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityMethods {
	Sheet wsheet=null;
	Workbook wbook=null;
	File file=null;
	FileOutputStream Fos=null;
	public void Common_waitStatic(int timeUnit) {
		java.time.LocalDateTime nowdt = java.time.LocalDateTime.now();
		int mnt = nowdt.getMinute();
		int sce = nowdt.getSecond();
		int timetampNow1 = (mnt * 60) + sce;
		int timetampNow2 = 0;
		int i = 0;
		while (timetampNow2 < timeUnit) {
			java.time.LocalDateTime nowdt1 = java.time.LocalDateTime.now();
			mnt = nowdt1.getMinute();
			sce = nowdt1.getSecond();
			int c = (mnt * 60) + sce;
			timetampNow2 = c - timetampNow1;
			i++;
		}
		System.out.println("Wait: " + timetampNow2 + " Second");
	}

	public void Common_ScrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");
	}

	public void Common_ScrollPageAndGetBottomLink(WebDriver driver) {
		String f="false";

		while(f=="false") {

			try {
				WebElement weBTMLink=driver.findElement(By.xpath("//span[text()='Add photos/video']"));
				f="true";
			}catch(Exception e) {
				Common_ScrollDown(driver);
			}
		}


	}

	public void WriteDataInWorkbook(int RowNum, String StrName,String ImgPath) {
	    Row rowobj=wsheet.createRow(RowNum);
	    rowobj.createCell(0).setCellValue(StrName);
	    rowobj.createCell(1).setCellValue(ImgPath);
	}
	
	public void CreateWorkBookAndSheet() {
		String dt=java.time.LocalDateTime.now().toString();
		dt=dt.replaceAll("-", "").replaceAll(":", "").replaceAll("\\.", "");
		file=new File("src\\main\\resources\\DataFilles\\FriendsData"+dt+".xlsx");
		String strFpath=file.getName();		
	    if (strFpath.contains("xlsx")) {
	    	wbook=new XSSFWorkbook();
	    }else {
	    	wbook=new HSSFWorkbook();
	    }
       
	    wsheet=wbook.createSheet("FrdName");
	    Row rowobj=wsheet.createRow(0);
	    rowobj.createCell(0).setCellValue("Name");
	    rowobj.createCell(1).setCellValue("Image");
	}
	
	public void saveExcelData() {
		try {
			Fos=new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			wbook.write(Fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
