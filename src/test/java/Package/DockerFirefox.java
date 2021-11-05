package Package;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class DockerFirefox extends Browser
{

	@Test
	public void chrome() throws MalformedURLException
	{
        String baseUrl = "https://b2bui2.tltid.com/login";

        String expectedTitle = "Login";

        PageFactory.initElements(driver,Xpaths.class);

        driver.get(baseUrl);

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        if (actualTitle.contentEquals(expectedTitle))
		{
          System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");

		}

	}

    @Test
	public void loginbutton() throws InterruptedException
	{

		Thread.sleep(10);

		String b = Xpaths.submit.getText();

		System.out.println(b);

		Xpaths.submit.click();

		if(b.contentEquals("Login"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test passed");
		}

      }

	@Test
	public void password() throws IOException
	{
		System.out.println("driver="+driver);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Xpaths.username.click();

		System.out.println("username field clicked");

		Xpaths.username.sendKeys("a.pandian@wintlt.com");

		System.out.println("Username field entered");

		Xpaths.password.click();

		System.out.println("password field clicked");

		Xpaths.password.sendKeys("12345S#");

		System.out.println("password field entered");

		JavascriptExecutor js = driver;

		js.executeScript("arguments[0].click();", Xpaths.submit);
	}

	@Test
	public void password1() throws IOException, InterruptedException
	{
		System.out.println("driver="+driver);

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		Thread.sleep(30000);

		Xpaths.From.click();

		Xpaths.From.sendKeys("YVR");
	}

	@Test
	public void tofield() throws IOException
	{
		System.out.println("driver="+driver);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Xpaths.TO.click();

		Xpaths.TO.sendKeys("YYZ");
	}

}
