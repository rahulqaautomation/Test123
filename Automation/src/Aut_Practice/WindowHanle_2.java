package Aut_Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WindowHanle_2 {

	public static void main(String[] args) {
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

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		WebElement btnNewTab=driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		btnNewTab.click();
		
		Set<String> wndsId=driver.getWindowHandles();

		Iterator<String> WiT=wndsId.iterator();

		while(WiT.hasNext()) {
			String x=WiT.next();
			driver.switchTo().window(x);
			String WindowTitalename=driver.getTitle();
			System.out.println(WindowTitalename);
			if (WindowTitalename.equalsIgnoreCase("AlertsDemo - H Y R Tutorials")) {
				break;
			}
				
		}
		
	}

}
