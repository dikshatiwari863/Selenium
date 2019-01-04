package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginOrSignUpPage 
{
@FindBy(id="email")
private WebElement emailOrPhoneTB;
@FindBy(id="pass")
private WebElement passwordTB;
@FindBy(xpath="//input[@value='Log In']")
private WebElement loginBTN;
private WebElement firstNameTB;
private WebElement lastNameTB;
private WebElement MobileOrEmailTB;
private WebElement newPasswordTB;
private WebElement dayDropDownList;
private WebElement monthDropDownList;
private WebElement yearDropDownList;
private WebElement femaleRB;
private WebElement maleRB;
private WebElement signUPBTN;

public FacebookLoginOrSignUpPage(WebDriver driver)
{

	PageFactory.initElements(driver,this);

}
public void enterEmailOrPhone(String emailOrPhone)
{
	emailOrPhoneTB.sendKeys(emailOrPhone);
}

public void enterPassword(String pwd)
{
	passwordTB.sendKeys(pwd);
}

public void clickOnLogin()
{
	loginBTN.click();
}

}
