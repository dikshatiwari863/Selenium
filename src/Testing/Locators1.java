package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 
{

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/ganesha/Desktop/Basic.html");
			//identifying text box
			
			//by using cssSelector with tagname input and attribute as-type
			
			//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Diksha Tiwari");
			
			//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("diksha2123#");
			
			//identifying links using cssSelector with tagname a and attribute as-id
			
					//driver.findElement(By.cssSelector("a#fb")).click();
					
					//identifying links using cssSelector with tagname a and attribute as-name
					
					//driver.findElement(By.cssSelector("a[name='pass']")).click();
					//Thread.sleep(2000);
					//driver.close();
			
			//identifying links using cssSelector with tagname a and attribute as-class
			
			driver.findElement(By.cssSelector("a.abc")).click();
			Thread.sleep(2000);
			driver.close();
					
					
		}
	}
	