package Aut_Practice;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupHandling {


	
	public static void main(String[] args) {
	
		//Webdriver ---Implements-- RemoteWebDriver--extends---- ChromeDriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ersan\\OneDrive\\Desktop\\Automation_Practice\\chromedriver.exe");
		String Brname="ch";
		
		WebDriver driver=null;
		if(Brname=="ch") {
			driver = new ChromeDriver();
			
		}else if(Brname=="ie") {	
			driver=new InternetExplorerDriver();
		
		}else if (Brname=="ff") {
			driver = new FirefoxDriver();
		}
	
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		WebElement username = driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");	
		WebElement userpwd = driver.findElement(By.xpath("//input[@name='user_password']"));
		userpwd.sendKeys("admin");		
		WebElement Login = driver.findElement(By.xpath("//input[@name='Login']"));
		Login.click();
		
		List<WebElement> HdrColl = driver.findElements(By.xpath("//td[@class='tabSelected' or @class='tabUnSelected']"));
		for(WebElement weobj : HdrColl) {
			
			action.moveToElement(weobj).build().perform();
			String strHdrText=weobj.getText();
			List<WebElement> sublinkcoll=driver.findElements(By.xpath("//div[@id='"+strHdrText+"_sub']//a[@class='drop_down']"));
			System.out.println(strHdrText+"--Its Sub link count is :: "+sublinkcoll.size());
			
		}

		
		
		
		
		
		
		
		
		
//		
//		WebElement salesobj = driver.findElement(By.xpath("//a[contains(text(),'Sales')]"));
//		salesobj.click();
//		
//		List<WebElement> webleadcoll=driver.findElements(By.xpath("//td[contains(text(),'LEA')]"));		
//		int i=0;
//		boolean f=false;
//		for(WebElement weobj : webleadcoll) {
//			String strtext = weobj.getText().trim();
//			i=i+1;
//			if(strtext.equalsIgnoreCase("LEA8")) {				
//				WebElement chkBox = driver.findElement(By.xpath("(//input[@name='selected_id'])["+i+"]"));
//				chkBox.click();	
//				f=true;
//			}
//		}
//		
//	
//		
//		
//		WebElement Deleteobj=driver.findElement(By.xpath("//input[@value='Delete']"));
//		Deleteobj.click();
//		
//		driver.switchTo().alert().accept();
//
//		if(f==true) {
//			System.out.println("record deleted successfully");
//		}else {
//			System.out.println("record is not deleted");
//		}

	}

}
