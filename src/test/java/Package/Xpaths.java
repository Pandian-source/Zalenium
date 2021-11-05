package Package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Xpaths {
	
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	public static WebElement submit;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Enter Your Email*']")
	public static WebElement username;
	
	@FindBy(how=How.XPATH, using="//input[@type='password']")
	public static WebElement password;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[2]")
	public static WebElement From;
	
	@FindBy(how=How.XPATH, using="(//input[@type='text'])[3]")
	public static WebElement TO;

}
