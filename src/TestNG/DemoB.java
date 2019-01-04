package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class DemoB {
  
@Test
  public void irctcLogin() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	  
	  WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		
		driver.findElement(By.id("loginbutton")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(1000);
		String eText="Enter User ID";
		
		String aText=a.getText();
		Assert.assertEquals(eText, aText);
		Reporter.log(aText,true);
		
  }
}
