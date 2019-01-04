package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_RadioButton 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement rd=driver.findElement(By.xpath("//input[@value='1']"));
		
		//rd.click();

		if(rd.isSelected())
		{	
			System.out.println("Female radio button is selected");
		}
		else
		{
			System.out.println("Female radio button is not selected");
		}
		driver.close();
}
}