package Aut_Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
public class PracticeWork {

	
	public static void main(String [] args) {
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
		
		
		driver.get("https://www.naukri.com/registration/createAccount?");
		driver.navigate().to("https://www.naukri.com");
		driver.manage().window().maximize();
	//	driver.navigate().back();
		driver.navigate().forward();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		


}

}
