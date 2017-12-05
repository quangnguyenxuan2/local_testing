package phpTravels.pack.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

	private WebDriver driver;
	
	private By txt_firstName = By.name("firstname"); //.form-control[placeholder='First Name']
	private By txt_lastName = By.name("lastname");
	private By txt_phone = By.name("phone");
	private By txt_email = By.name("email");
	private By txt_password = By.name("password");
	private By txt_confirmpwd = By.name("confirmpassword");
	private By btn_signUp = By.xpath("//button[contains(.,' Sign Up')]");

	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterFirstName(String firstname)
	{
		WebElement elm_firstName = driver.findElement(txt_firstName);
		if (elm_firstName.isDisplayed() && elm_firstName.isEnabled())
			elm_firstName.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname)
	{
		WebElement elm_lastName = driver.findElement(txt_lastName);
		if (elm_lastName.isDisplayed() && elm_lastName.isEnabled())
			elm_lastName.sendKeys(lastname);
	}
	
	public void enterPhone(String phonenumber)
	{
		WebElement elm_phoneNumber = driver.findElement(txt_phone);
		if (elm_phoneNumber.isDisplayed() && elm_phoneNumber.isEnabled())
			elm_phoneNumber.sendKeys(phonenumber);
	}
	
	public void enterEmail(String email)
	{
		WebElement elm_email = driver.findElement(txt_email);
		if (elm_email.isDisplayed() && elm_email.isEnabled())
			elm_email.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		WebElement elm_password = driver.findElement(txt_password);
		if (elm_password.isDisplayed() && elm_password.isEnabled())
			elm_password.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmpassword)
	{
		WebElement elm_confirmpassword = driver.findElement(txt_confirmpwd);
		if (elm_confirmpassword.isDisplayed() && elm_confirmpassword.isEnabled())
			elm_confirmpassword.sendKeys(confirmpassword);
	}
	
	
	public String getSignUpPageTitle()
	{
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public void clickOnSignUp() {
		WebElement elm_SignUpBtn = driver.findElement(btn_signUp);
		if (elm_SignUpBtn.isDisplayed())
			elm_SignUpBtn.click();		
	}
	
	//------verify----
	public boolean isPageTitle(){
		String ExpectedTitle = "Register";
		return getSignUpPageTitle().contains(ExpectedTitle);
	}
}
