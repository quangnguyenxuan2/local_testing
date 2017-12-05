package phpTravels.pack.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import phpTravels.pack.base.*;

public class SignInPage {
	
	private WebDriver driver;

	private By txt_username = By.name("username");
	private By txt_password = By.name("password");
	private By btn_login = By.cssSelector(".btn.btn-action.btn-block.loginbtn");
	private By msg_error = By.cssSelector(".alert.alert-danger");
	private By lnk_signUp = By.linkText("Sign Up");
	private By lnk_forgot = By.cssSelector("//a[@href='#ForgetPassword']");
	
	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//enter username
	public void enterUsername(String username)
	{
		WebElement elm_username = driver.findElement(txt_username);
		if (elm_username.isDisplayed())
		{
			elm_username.clear();
			elm_username.sendKeys(username);
		}
			
	}
	//enter password
	public void enterPassword(String password)
	{
		WebElement elm_password = driver.findElement(txt_password);
		if (elm_password.isDisplayed())
		{
			elm_password.clear();
			elm_password.sendKeys(password);
		}
	}
	
	//click login
	public void clickOnSignIn()
	{
		WebElement elm_signinBtn = driver.findElement(btn_login);
		if (elm_signinBtn.isDisplayed())
			elm_signinBtn.click();
	}
	
	//get page Title
	public String getSignInPageTitle ()
	{
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	//get error message when invalid login
	public String getErrorMessage ()
	{
		String strErrorMsg = null;
		WebElement errorMsg = driver.findElement(msg_error);
		if (errorMsg.isDisplayed())
			strErrorMsg = errorMsg.getText();
		return strErrorMsg;
	}
	
	//action click SignUp
	public SignUpPage clickOnSignUp()
	{
		WebElement elm_signup = driver.findElement(lnk_signUp);
		if (elm_signup.isDisplayed() || elm_signup.isEnabled())
			elm_signup.click();
		return new SignUpPage(driver);
	}
	
	//action click forgot pass
	public void clickOnForgotPwd()
	{
		WebElement elm_forgot = driver.findElement(lnk_forgot);
		if(elm_forgot.isDisplayed())
			elm_forgot.click();
	}

	//verify title page sign in
	public boolean isSignInPageTitle()
	{
		String expectedTitle = "Login 444";
		return getSignInPageTitle().contains(expectedTitle);
	}

	public boolean isErrorMsg()
	{
		String expectedErrorMsg = "Invalid Email or Password";
		return getErrorMessage().contains(expectedErrorMsg);
	}
}
