package Aut_Practice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger_SC1 {

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

		List<WebElement> lstColl=driver.findElements(By.xpath("//td[@class='tabUnSelected' or @class='tabSelected']"));

		for(int i=0;i<lstColl.size();i++) {
			String HdrText = lstColl.get(i).getText().trim();
			action.moveToElement(lstColl.get(i)).build().perform();

			List<WebElement> ChildCollobj= driver.findElements(By.xpath("//div[@id='"+HdrText+"_sub']//a[@class='drop_down']"));

			System.out.println(HdrText+" :: count of DropDown Link--"+ChildCollobj.size());
			for(int j=0;j<ChildCollobj.size();j++) {
				String strChText = ChildCollobj.get(j).getText();
				System.out.println(strChText);
				ChildCollobj.get(j).click();
				String text1="";
				String strExptext=HdrText+" > "+strChText;
				try {
					WebElement weChiled=driver.findElement(By.xpath("//td[@class='moduleName']"));
					text1=weChiled.getText();
				}catch(Exception e ) {
					System.out.println(strExptext+" Records is not diplayed on the Page");
				}
				PracticeWithTryCatch obj= PracticeWithTryCatch.GetObject();
				obj.
				String strActualText=text1;
				if(strExptext.equalsIgnoreCase(strActualText)) {
					System.out.println(strExptext+": Pass");
				}else {
					System.out.println(strExptext+": Fail");
				}
				lstColl=driver.findElements(By.xpath("//td[@class='tabUnSelected' or @class='tabSelected']"));
				action.moveToElement(lstColl.get(i)).build().perform();
				ChildCollobj= driver.findElements(By.xpath("//div[@id='"+HdrText+"_sub']//a[@class='drop_down']"));
			}
		}


	}

}
