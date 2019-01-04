package Testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_AutoSuggestion_iPhone
{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		
		driver.findElement(By.className("_2AkmmA _29YdH8"));
		driver.findElement(By.name("q")).sendKeys("iPhone");
		
		
		List<WebElement> iphoneSugg=driver.findElements(By.xpath("//li[contains(@class,'_1va75j')]"));
		
		int count=iphoneSugg.size();
	
	}
}

