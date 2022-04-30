package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class priorityTest extends TestBase
{
	public priorityTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
		LoginPage	login;
		@BeforeMethod
		public	void setup() throws	IOException
		{
		initalization();
		login	=	new	LoginPage();
		}
		@Test	(enabled =false,invocationCount	=5)
		public	void	verifyLoginPageTitleTest()
		{
		String	expZerodhaTitle	=	"Kite - Zerodha's	fast and elegant flagship trading  platform";
		String	actZerodhaTitle	=	login.verifyLoginPageTitle();
		Assert.assertEquals(actZerodhaTitle,	expZerodhaTitle);
		Reporter.log("Title	= "	+actZerodhaTitle);
		}
		@Test	(enabled = false)
		public	void verifyKiteLogoTest()
		{
		boolean	value = login.verifyKiteLogo();
		Assert.assertEquals(value, true);
		Reporter.log("Kite logo is	"	+value);
		}
		@Test	(enabled = false)
		public	void verifyZerodhaLogoTest()
		{
		boolean	value = login.verifyZerodhaLogo();
		Assert.assertEquals(value, true);
		}
		@Test	(enabled	= true,timeOut =500)
		public	void loginZerodhaAccTest()	throws	InterruptedException
		{
		login.loginZerodhaAcc();
		}
		@AfterMethod
		public	void	exit()
		{
		driver.close();
		}
}
