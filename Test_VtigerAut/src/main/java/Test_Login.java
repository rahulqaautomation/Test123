import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_Login {

	@Test
	public void LoginAndVerifyHomePage() {
		
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

	}
}
