package Pages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;

class DashboradPageTest extends TestBase
{
	public DashboradPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public	void DashboardPageTest() throws	IOException	{
		//super();
		}
		DashboardPage dash;
		LoginPage login;
		@BeforeMethod
		public	void setup() throws	InterruptedException, IOException
		{
		initalization();
		dash = new	DashboardPage();
		login = new	LoginPage();
		login.loginZerodhaAcc();
		}
		@Test
		public	void verifyNicknameTest() throws InterruptedException
		{
		String	value	= dash.verifyNickname();
		Thread.sleep(5000);
		Assert.assertEquals(value, "Vishwas");
		}
		@AfterMethod
		public void exit()
		{
		driver.close();
		}
}
