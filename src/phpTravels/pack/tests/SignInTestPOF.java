package phpTravels.pack.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import phpTravels.pack.pageobjects.SignInPagePOF;

public class SignInTestPOF {
	
	private static WebDriver driver;
	//---page of factory---
	private SignInPagePOF signInPage = PageFactory
			.initElements(driver, SignInPagePOF.class);
	
	@BeforeClass
	public static void SetUp()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.phptravels.net/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void CheckLogInPageSuccessPOF()
	{
		signInPage.enterUsername("admin");
		signInPage.enterPassword("password");
		signInPage.clickLoginButton();
	}
	
	@Test
	public void CheckLogInPageNOTSuccessPOF()
	{
		signInPage.enterUsername("adminInValid");
		signInPage.enterPassword("passwordInValid");
		signInPage.clickLoginButton();
	}
	
	@AfterClass
	public void afterClass() {
		//Close the browser
		driver.close();
		driver.quit();
	  }
	
}
