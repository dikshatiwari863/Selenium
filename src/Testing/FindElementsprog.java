package Testing;


	import java.util.List;
	import java.util.concurrent.TimeoutException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FindElementsprog 
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/ganesha/Desktop/Cb.html");
			List<WebElement> cb=driver.findElements(By.xpath("//input[@type='checkbox']"));
			
			for(int i=(cb.size()-1);i>=0;i--)
			{
				WebElement e=cb.get(i);
				Thread.sleep(2000);
				e.click();
				
			}
		}
	}

