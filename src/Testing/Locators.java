package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ganesha/Desktop/Basic.html");
		
		//identifying links
		
		//by using attribute-id
		
		driver.findElement(By.id("fb")).click();
		Thread.sleep(2000);
		driver.close();
		//by using attribute-name
		
				driver.findElement(By.name("pass")).click();
						Thread.sleep(2000);
						driver.close();
						
				//by using attribute-class
						
						driver.findElement(By.className("abc")).click();
								Thread.sleep(2000);
							driver.close();
								
				//by using linkText
								
								driver.findElement(By.linkText("Forgot Password???")).click();
								Thread.sleep(2000);
								driver.close();
		      //by using linkText
								
								driver.findElement(By.partialLinkText("Inbox")).click();
								Thread.sleep(2000);
								driver.close();
								
				
	}

}
