package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase 
{
	public	static	WebDriver	driver;
	public	static	Properties	prop;	
	public	TestBase()	throws	IOException
	{
	prop	=	new	Properties();
	FileInputStream	file =new	FileInputStream("C:\\Users\\admin\\eclipse-workspace\\framework\\src\\main\\java\\Config\\config.properties");
	prop.load(file);
	}
	public	void initalization()
	{
	ChromeOptions	options	= new	ChromeOptions();
	options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver",	"chromedriver.exe");
	driver	=new	ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(10,	TimeUnit.SECONDS);
	}
}
