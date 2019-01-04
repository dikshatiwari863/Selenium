package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login 

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:facebook.com");
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("dikshatiwari863@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("***********");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		driver.findElement(By.cssSelector("input[name='firstname']"));//first name textbox
		driver.findElement(By.cssSelector("input[name='lastname']"));//Last name textbox
		
		driver.findElement(By.cssSelector("input[name='reg_email__']"));//Mobile name or email address
		driver.findElement(By.cssSelector("input[name='reg_passwd__']"));//new password
		
		
		driver.findElement(By.cssSelector("button[name='websubmit']"));//sign-up
		
		
		Thread.sleep(2000);
		driver.close();
		
	

	}
}

