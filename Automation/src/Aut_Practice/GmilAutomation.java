package Aut_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GmilAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ersan\\OneDrive\\Desktop\\Automation_Practice\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		
		ChromeDriver driver =new ChromeDriver(options);
 
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
        driver.get("https://mail.google.com/");
        WebElement l = driver.findElement(By.xpath("//input[@autocomplete='username']"));
        l.sendKeys("19tit102.abhishek.a51@gmail.com");
        driver.findElement(By.xpath("//div[@id=\"identifierNext\"]/div/button")).click();
        WebElement b = driver.findElement(By.xpath("//input[@type='password']"));
        b.sendKeys("8850151521123");
        
        
        
	}

}
