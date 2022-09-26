package Aut_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameHandling {

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
	
		driver.get("http://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
//		WebElement textbox1=driver.findElement(By.xpath("//input[@id='name']"));
//		textbox1.sendKeys("admin");
		
//		driver.switchTo().frame("frm1");
//		
//		WebElement selectobj = driver.findElement(By.xpath("//select[@id='course']"));		
//		Select selobj=new Select(selectobj);
//		selobj.selectByVisibleText("Java");
//		
//		driver.switchTo().defaultContent();
//		textbox1.clear();
//		textbox1.sendKeys("Hello");
//		//-----------------enter values in other frame--- frame2
//		driver.switchTo().frame("frm2");
//		WebElement Fname = driver.findElement(By.xpath("//input[@id='firstName']"));
//		Fname.sendKeys("Test1");
//		driver.switchTo().defaultContent();
		//--------------handle nexted frame---------------------------------------------
		
		driver.switchTo().frame("frm3");  ///--- Parent Frame
		WebElement hdrMenu=driver.findElement(By.xpath("//select[@id='selectnav2']"));
		Select Menuselect = new Select(hdrMenu);
		Menuselect.selectByVisibleText("Home"); // selecting value from parent 
		
		driver.switchTo().frame("frm1"); // child frame
		Menuselect.selectByVisibleText("Contact");/// selecting in chile frame-2
		
		driver.switchTo().parentFrame();
		Menuselect.selectByVisibleText("Contact");// selecting value from parent
	
		
		
	}

}
