package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_CvUpload {


		public static void main(String[] args) throws InterruptedException, AWTException 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			
	driver.findElement(By.xpath("//input[@value='Post your CV']")).click();
			
			StringSelection s=new StringSelection("C:\\Users\\ganesha\\Desktop\\Resume-Diksha Tiwari.doc");
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
			
			Robot r=new Robot();
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			//driver.close();
			
			
			
			
			

	}

}
