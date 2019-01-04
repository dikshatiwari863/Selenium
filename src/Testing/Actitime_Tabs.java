package Testing;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Tabs {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		ArrayList<String> al=new ArrayList<String>();
		
		String pTab=driver.getWindowHandle();

		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		

		Set<String> allTabs=driver.getWindowHandles();
		Thread.sleep(2000);
		allTabs.remove(pTab);
		
		//to close all the tab without using quit()
		for(String tab:allTabs)
		{
			driver.switchTo().window(tab);
			driver.close();
		}
		
		//to print title of all tab
		
			for(String tab:allTabs)
			{
			driver.switchTo().window(tab);
			String title=driver.getTitle();
			System.out.println(title);
			}
			
		//to close the specified tab

			for(String tab:allTabs)
			{
			driver.switchTo().window(tab);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.equals("actiTIME - Login"))
			{
				driver.close();
			}
			break;
			}
			
		//to check whether specified tab is present or not
			
			for(String tab:allTabs)
			{
			driver.switchTo().window(tab);
			String title=driver.getTitle();
			System.out.println(title);
			al.add(title);
			}
			
			if(al.contains("actiTIME - Time Tracking & Scope Management Software"))
			{
				System.out.println("tab is present");
			}
			else
			{
				System.out.println("tab is not present");
			}
		
			//to switch control to specified tab
			for(String tab:allTabs)
			{
			driver.switchTo().window(tab);
			String title=driver.getTitle();
			if(title.equals("actiTIME - Login"))
			{
				break;
			}
			}
			
			//to close the child tab and switch the control to parent tab
			for(String tab:allTabs)
			{
			driver.switchTo().window(tab);
			driver.close();
			
			}
			driver.switchTo().window(pTab);
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("admin");

}
}