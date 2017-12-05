package phpTravels.pack.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import phpTravels.pack.base.BasePage;
//import phpTravels.pack.*;
//import phpTravels.pack.base.BasePage;
import phpTravels.pack.pageobjects.SignInPage;
import phpTravels.pack.pageobjects.SignUpPage;

public class SignInTest {

	private static WebDriver driver;
	private SignInPage signInPage;
	private BasePage basePage;
	private SignUpPage signUpPage;
	
	@BeforeClass
	public static void SetUp()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.phptravels.net/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void checkClickSignUpSuccess() throws Exception
	{
		signInPage = new SignInPage(driver);
		signUpPage = signInPage.clickOnSignUp();
		//Assert.assertTrue(signUpPage.isPageTitle(), "Click button Sign Up not Success");
	
		if (!signUpPage.isPageTitle() == true)
			System.out.println("False");
		else
			System.out.println("you are in sign up page");
		
	}
	
	
	public void checkLogInNOTSuccess() throws Exception
	{
		System.out.println("---Check Log In NOT Success with inValid Account---");
		//basePage = new BasePage(driver);
		signInPage = new SignInPage(driver);
		signInPage.enterUsername("ahaha@gmail.coms");
		signInPage.enterPassword("12123123");
		signInPage.clickOnSignIn();
		//Assert.assertTrue(signInPage.isErrorMsg(), "Error Message invalid is not match - Failed");
		
		if (!signInPage.isErrorMsg() == true){
			System.out.println("Error Message invalid is not match - Failed");
		}
		
		Assert.assertTrue(signInPage.isSignInPageTitle(), "Title Sign In page is not match - Failed");
			
	}
	
	
	public void checkLogInSuccess() throws Exception
	{
		//--to be defined--
		System.out.println("---Check Log In Success with Valid Account---");
		signInPage.enterUsername("emailtest111@gmail.quangtest");
		signInPage.enterPassword("123456");
		signInPage.clickOnSignIn();
		//verify sign in success on my account page ???
		
		
	}
}
