package Package;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Browser 
{

	public static RemoteWebDriver driver;

	@BeforeSuite
	public static void setUp() throws Exception 
	{

		DesiredCapabilities Cap = new  DesiredCapabilities();

		Cap.setPlatform(Platform.LINUX);

		Cap.setBrowserName(BrowserType.FIREFOX);

		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),Cap);
	}

	@AfterSuite
	public void close() throws InterruptedException
	{
		driver.close();

		System.out.println("browser closed");

		SendMailSSLWithAttachment.mail(null);
	}
}
