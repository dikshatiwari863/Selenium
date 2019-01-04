package Testing;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Table 
{

public static void main(String[] args) 
		{
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
						WebDriver driver=new ChromeDriver();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.manage().window().maximize();
						driver.get("file:///C:/Users/ganesha/Desktop/table.html");
		
						WebElement firstTable=driver.findElement(By.tagName("tr"));
						
						List<WebElement> allCells = firstTable.findElements(By.tagName("td"));
						
						int count=allCells.size();
						
						System.out.println(count);
						

	}
	}

