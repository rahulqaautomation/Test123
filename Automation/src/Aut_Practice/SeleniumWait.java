package Aut_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class SeleniumWait {

	public static void main(String[] args) throws InterruptedException, IOException, TesseractException {

		for(int i=0;i<20;i++){
			
			if(i>2){
				int z=i+(i-1);
				System.out.println(z);
			}else{
				System.out.println(i);
			}
			
		}

			//		String x="He1llo in3dia a4nd w5orld";
			//
			//		String [] arrval=x.split(" ");
			//		for(int i=0; i<arrval.length;i++){
			//			i=i+1;
			//			String v=arrval[i];
			//			System.out.println(v+"--"+i);
			//		}


			//		File file=new File("FilesImg//Program.txt");
			//		String s=file.getAbsolutePath();
			//		System.out.println(s);
			//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ersan\\OneDrive\\Desktop\\Automation_Practice\\chromedriver.exe");
			//		ChromeOptions options = new ChromeOptions();
			//		options.addArguments("start-maximized");
			//		options.addArguments("--disable-notifications");
			//		WebDriver driver =new ChromeDriver(options);
			//
			//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//		driver.get("https://www.irctc.co.in/nget/train-search");
			//		TakesScreenshot takescreenshot=(TakesScreenshot)driver;
			//		File srcFile=takescreenshot.getScreenshotAs(OutputType.FILE);
			//		File DestFile=new File("FilesImg//Test1.png");
			//		
			//		FileUtils.copyFile(srcFile, DestFile);

			//		int x=10;
			//		int y=20;
			//		x=x+y;
			//		y=x-y;
			//		x=x-y;
			//		System.out.println(x+"----"+y);

			//		String x="Hello";
			//		String y="India World";	
			//		x=x+y;
			//		y=x.substring(0, x.length()-y.length());
			//		x=x.substring(y.length());
			//		System.out.println(y);




			//		driver.findElement(By.xpath("//button[@type='submit']")).click();
			//		WebElement HeaderTimeobj=driver.findElement(By.xpath("//strong[contains(text(),'2022')]"));
			//		HeaderTimeobj.click();
			////		driver.switchTo().alert().accept();
			//		driver.findElement(By.xpath("//a[contains(text(),'LOGIN')] ")).click();
			//		WebElement weobj=driver.findElement(By.xpath("(//div[@id='nlpCaptchaContainer']//img)[2]"));
			//
			//		File src=weobj.getScreenshotAs(OutputType.FILE);
			//		File f=new File("C:\\Users\\ersan\\OneDrive\\Desktop\\Image\\IRCaptcha.png");
			//		FileHandler.copy(src, f);
			//		ITesseract image=new Tesseract();
			//		image.setDatapath("C:\\Users\\ersan\\OneDrive\\Desktop\\ddd\\Tess4J\\tessdata");
			//		String x=image.doOCR(f);
			//		System.out.println(x);

			//        //explicitelly wait
			//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700000));
			//        boolean b1=wait.until(ExpectedConditions.textToBePresentInElement(HeaderTimeobj, "24-Aug-2022 [20:33:39]"));
			//        System.out.println(b1);
			//        //---------------------------
			//        
			//
			//       //fluent Wait
			//        
			//        Wait<WebDriver> wait2= new FluentWait<WebDriver>(driver)
			//        		.withTimeout(Duration.ofSeconds(30))
			//        		.pollingEvery(Duration.ofSeconds(5))
			//        		.ignoring(NoSuchElementException.class);
			//       
			//        wait2.until(ExpectedConditions.elementToBeClickable(HeaderTimeobj));
			//        
		}

	}
