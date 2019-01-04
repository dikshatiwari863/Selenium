package Testing;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login 
{
	public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/intl/en-GB/gmail/about/");
			driver.findElement(By.xpath("//a[.='Sign In']")).click();;
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dikshatiwari863@gmail.com");
			
			driver.findElement(By.xpath("//span[.='Next']")).click();
			
			driver.findElement(By.name("password")).sendKeys("sajaldixitdiks");
			
			driver.findElement(By.xpath("//span[.='Next']")).click();
			
			Thread.sleep(1000);
			
			//driver.close();
			
		}
	}

