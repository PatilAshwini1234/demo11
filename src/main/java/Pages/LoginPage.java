package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase
{
	@FindBy(xpath="//input[@id='userid']") private	WebElement userIdTextbox;
	@FindBy(xpath="//input[@id='password']") private	WebElement	passwordTextbox;
	@FindBy(xpath="//button[@type='submit']") private	WebElement	loginBtn;
	@FindBy(xpath="//img[@alt='Kite']") private	WebElement	kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']") private	WebElement	zerodhaLogo;
	@FindBy(xpath="//input[@label='PIN']") private	WebElement	pinTextbox;
	//Constructor
	public	LoginPage()	throws	IOException
	{
	// super();
	PageFactory.initElements(driver,	this);
	}
	//Methods
	public	String	verifyLoginPageTitle()
	{
	return	driver.getTitle();
	}
	public	boolean	verifyKiteLogo()
	{
	return	kiteLogo.isDisplayed();
	}
	public	boolean	verifyZerodhaLogo()
	{
	return	zerodhaLogo.isDisplayed();
	}
	public	void	loginZerodhaAcc()	throws	InterruptedException
	{
	userIdTextbox.sendKeys(prop.getProperty("userid"));
	 Thread.sleep(1000);
	passwordTextbox.sendKeys(prop.getProperty("password"));
	 Thread.sleep(1000);
	loginBtn.click();
	Thread.sleep(1000);
	pinTextbox.sendKeys(prop.getProperty("pin"));
    Thread.sleep(1000);
	loginBtn.click();
     Thread.sleep(5000);
	}

}
