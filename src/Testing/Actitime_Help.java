package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Help 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("//div[@class='popup_menu_icon support_icon']")).click();
		driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
		WebElement build=driver.findElement(By.xpath("//span[.='(build 40469)']"));
		String text=build.getText();
		System.out.println(text);
		driver.findElement(By.xpath("//div[@id='aboutPopupCloseButtonId']")).click();
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(1000);
		driver.close();
		
	
		
	}
}
