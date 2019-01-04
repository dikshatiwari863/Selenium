package Testing;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginOrSignUpTest {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) 
	
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		FacebookLoginOrSignUpPage fb=new FacebookLoginOrSignUpPage(driver);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email=");
		String email=sc.nextLine();
		
		fb.enterEmailOrPhone(email);
		
		System.out.println("enter password=");
		String pwd=sc.nextLine();
		
		fb.enterPassword(pwd);
		
		fb.clickOnLogin();
		
		
		
		
		

	}

}
