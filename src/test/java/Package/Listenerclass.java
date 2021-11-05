package Package;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listenerclass implements ITestListener
{

	String filePath = "./Screenshots";

	@Override
	public void onTestStart(ITestResult result)
	{

	}
	@Override
	public void onTestSuccess(ITestResult result)
	{

	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName()+" Test has Failed");
		String methodName=result.getName().toString().trim();
		ITestContext context = result.getTestContext();
		WebDriver driver = (WebDriver)context.getAttribute("driver");
		takeScreenShot(methodName, driver);
	}

	public void takeScreenShot(String methodName, WebDriver driver)
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
			System.out.println("Successfully Taken the screenshot");
		}
		catch (IOException e)
		{
			e.printStackTrace();

		}
	}


	@Override
	public void onTestSkipped(ITestResult result)
	{

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{

	}

	@Override
	public void onStart(ITestContext context)
	{

	}

	@Override
	public void onFinish(ITestContext context)
	{

	}}