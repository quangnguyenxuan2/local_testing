package phpTravels.pack.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import phpTravels.pack.pageobjects.SignInPage;
import phpTravels.pack.pageobjects.SignUpPage;

public class SignUpTest {

	private static WebDriver driver;
	private SignUpPage signUpPage;
	//private BasePage basePage;
	
	@BeforeClass
	public static void SetUp()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.phptravels.net/register");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void checkEnterInforSignUpSuccess() throws Exception
	{
		signUpPage = new SignUpPage(driver);
		signUpPage.enterFirstName("account222");
		signUpPage.enterLastName("account222");
		signUpPage.enterEmail("emailcorrect222@gmail.email22"); //correct email format
		signUpPage.enterPassword("123456");
		signUpPage.enterConfirmPassword("");
		signUpPage.clickOnSignUp();
		
	}
}
