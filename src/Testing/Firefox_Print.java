package Testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Print {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_P);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyRelease(KeyEvent.VK_P);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_G);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_G);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_5);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_5);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_C);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_5);
		Thread.sleep(2000);
		
		r.keyRelease(KeyEvent.VK_5);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
