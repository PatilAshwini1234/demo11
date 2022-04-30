package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{
	public	LoginPageTest()	throws	IOException	{
		super();
		}
		LoginPage login;
		@BeforeMethod
		public void setup() throws	IOException
		{
		initalization();
		login = new LoginPage();
		}
		@Test
		public void verifyLoginPageTitleTest()
		{
		String	expZerodhaTitle	= "Kite - Zerodha's fast and elegant flagship trading platform";
		
		String	actZerodhaTitle	=	login.verifyLoginPageTitle();
		Assert.assertEquals(expZerodhaTitle,actZerodhaTitle);
		Reporter.log("Title	=	" +actZerodhaTitle);
		}
		@Test	
		public void verifyKiteLogoTest()
		{
		boolean	value=login.verifyKiteLogo();
		Assert.assertEquals(value,	true);
		Reporter.log("Kite logo	is	"+	value);
		}
		@Test	
		public void verifyZerodhaLogoTest()
		{
		boolean	value = login.verifyZerodhaLogo();
		Assert.assertEquals(value,	true);
		}
		@Test
		public void loginZerodhaAccTest() throws InterruptedException
		{
		login.loginZerodhaAcc();
		}
		@AfterMethod
		public void exit()
		{
		driver.close();
		}

}
