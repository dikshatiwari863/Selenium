package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample 
{
	

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ganesha/Desktop/First.html");
		
		WebElement fname = driver.findElement(By.id("fn"));
		String v=fname.getAttribute("value");
		

		WebElement lname = driver.findElement(By.id("ln"));
		lname.sendKeys(v);
		
	

	}
}
