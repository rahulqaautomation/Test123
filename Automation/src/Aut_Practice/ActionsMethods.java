package Aut_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethods {

	public static void main(String[] args) {
		
		System.out.println(10==20);
		System.out.println('a'=='b');
		System.out.println('a' == 97.0);
        System.out.println(true == true);
		
//		//Webdriver ---Implements-- RemoteWebDriver--extends---- ChromeDriver
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ersan\\OneDrive\\Desktop\\Automation_Practice\\chromedriver.exe");
//		String Brname="ch";
//		
//		WebDriver driver=null;
//		if(Brname=="ch") {
//			driver = new ChromeDriver();
//			
//		}else if(Brname=="ie") {	
//			driver=new InternetExplorerDriver();
//		
//		}else if (Brname=="ff") {
//			driver = new FirefoxDriver();
//		}
//	
//		driver.get("http://localhost:8888/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
//		driver.manage().window().maximize();
//		Actions action = new Actions(driver);
//		
//		WebElement username = driver.findElement(By.xpath("//input[@name='user_name']"));
//
//		username.sendKeys("admin");
////		username.click();
////		action.sendKeys("admin").build().perform();
////		action.keyDown(username, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
//		
//		WebElement userpwd = driver.findElement(By.xpath("//input[@name='user_password']"));
////		action.keyDown(userpwd, Keys.CONTROL).sendKeys("v").build().perform();
//		userpwd.sendKeys("admin");
//		
////		action.contextClick().build().perform();
//		
////		userpwd.sendKeys("admin");
////		action.moveToElement(userpwd).click().sendKeys("admin").build().perform();
//
//		WebElement login=driver.findElement(By.xpath("//input[@name='Login']"));
//		
////		action.moveToElement(login).sendKeys(Keys.ENTER).build().perform();
//		login.click();
//		WebElement ptl=driver.findElement(By.xpath("//b[contains(text(),'Potentials')]/parent :: td"));
//		WebElement tpac=driver.findElement(By.xpath("//b[contains(text(),'Top A')]/parent :: td"));
//		action.dragAndDrop(ptl, tpac).build().perform();
//		
//		
//		System.out.println("");
	}

}
