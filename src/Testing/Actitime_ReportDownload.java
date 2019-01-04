package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Actitime_ReportDownload {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
			//WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		driver.findElement(By.xpath("//div[.='REPORTS']")).click();
		
		driver.findElement(By.xpath("//div[.='Monthly Team Performance']")).click();
		
		String xp="//td[contains(.,'    Export to CSV')]";
		
		driver.findElement(By.xpath(xp)).click();	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);	
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_S);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
