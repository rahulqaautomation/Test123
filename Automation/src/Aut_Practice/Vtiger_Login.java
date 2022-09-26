package Aut_Practice;

import java.util.ArrayList;
import java.util.Iterator;
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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Vtiger_Login {

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
		username.click();

//		action.moveToElement(username).contextClick().build().perform();
//		action.keyDown(Keys.ARROW_DOWN);
//		action.keyDown(Keys.ARROW_DOWN);
//		action.keyDown(Keys.ENTER);
		String strtext1 = username.getAttribute("value");
//		WebElement weLBl=driver.findElement(By.partialLinkText("User"));
//		String strtxt=weLBl.getText();
//		System.out.println(strtxt);
		
		WebElement userpwd = driver.findElement(By.xpath("//input[@name='user_password']"));
		userpwd.sendKeys("admin");
		userpwd.click();
//		action.moveToElement(userpwd).sendKeys("admin").build().perform();
		action.moveToElement(userpwd).contextClick().build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		action.keyDown(Keys.DOWN).build().perform();
		action.keyDown(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		
		
		WebElement HomeLink=driver.findElement(By.xpath("//a[@class='hdrLink']"));
		String cs=HomeLink.getCssValue("color");
		
		System.out.println(cs);
		
		if(cs=="rgba(0, 112, 186, 1)") {
			
		}
		
		
		WebElement Homeobj= driver.findElement(By.xpath("//a[text()='My Home Page']"));
//		mouse over, Right click
		
//		action.moveToElement(Homeobj).build().perform();
//		driver.findElement(By.xpath("//a[text()='Calendar']")).click();
		
		
		List<WebElement> wecoll=driver.findElements(By.xpath("//td[@class='tabUnSelected' or @class='tabSelected']"));
		for(WebElement weobj:wecoll) {
			action.moveToElement(weobj).build().perform();	
		}
		
		WebElement Wecal=driver.findElement(By.partialLinkText("Cal"));
		if(Wecal.isEnabled()==true) {
			String strval=Wecal.getText();
			System.out.println(strval);	
		}
	
		driver.findElement(By.xpath("//a[text()='Sales']")).click();
		
		List<WebElement> collchkbox=driver.findElements(By.xpath("//input[@name='selected_id']"));
		
		ListIterator<WebElement> chkall=collchkbox.listIterator();
		String x=driver.findElement(By.xpath("//input[@name='selectall']")).getAttribute("checked");
		System.out.println(x);
		while(chkall.hasNext()) {
			WebElement weobj=chkall.next();
			weobj.click();
		}
		x=driver.findElement(By.xpath("//input[@name='selectall']")).getAttribute("checked");
		System.out.println(x);
		
		
		
		
		
		
		
		
		
		
		
	}
}
