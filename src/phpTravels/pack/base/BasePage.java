package phpTravels.pack.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {

	public static WebDriver driver;
	
	//---define variable on base page
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@BeforeClass
	public static void SetUp()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.phptravels.net/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void EndTest()
	{
		//---driver.quit();
	}
	
	public void enterKey(By locator, String text)
	{
		
		try
		{
			
		} catch (Exception e)
		{
			
		}
	}
}
