package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AmazonLogin
{

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		String xp1="//span[@class='nav-sprite nav-logo-base']/../../../../..//span[.='Hello. Sign in']";
		WebElement sign=driver.findElement(By.xpath(xp1));
		act.moveToElement(sign).perform();
		driver.findElement(By.xpath("//a[.='Start here.']")).click();
		

	}

}
