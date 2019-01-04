package Testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class RedBrick_AboutUs 
{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://home.redbrickhealth.com");
			String  xp="//a[.='RedBrick Health']/../..//a[.='About Us']";
			
			WebElement aboutUs=driver.findElement(By.xpath(xp));
			
			Actions act=new Actions(driver);
			act.moveToElement(aboutUs).perform();
			List<WebElement> car=driver.findElements(By.xpath("//a[contains(@href,'https://home.redbrickhealth.com/about-us/*')]"));
			
			//int count=car.size();
				//String menu=car.getText();
			
				//System.out.println(menu);
		Thread.sleep(1000);
			driver.close();
		}
}

