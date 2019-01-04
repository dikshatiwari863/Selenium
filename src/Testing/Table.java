package Testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table 
{

			public static void main(String[] args) 
			
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/ganesha/Desktop/table.html");
				
				WebElement table=driver.findElement(By.id("t1"));
				
				List<WebElement> firstTable=table.findElements(By.tagName("td"));
				int count=firstTable.size();
				
				System.out.println(count);
			
			}			
	}

