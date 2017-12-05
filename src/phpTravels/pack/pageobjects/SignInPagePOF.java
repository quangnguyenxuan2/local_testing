package phpTravels.pack.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPagePOF {
	
	private WebDriver driver;
	
	@FindBy(how=How.ID,using = "")
	private WebElement txt_username;
	
	@FindBy(how=How.ID,using = "")
	private WebElement txt_password;
	
	@FindBy(how=How.ID,using = "")
	private WebElement btn_login;
	
	//
	public SignInPagePOF(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//methods enter username
	public void enterUsername(String usernametext)
	{
		
		if (txt_username.isDisplayed() && txt_password.isEnabled())
		{
			txt_username.clear();
			txt_username.sendKeys(usernametext);
		}
	}

	//enter password
	public void enterPassword(String passwordtext)
	{
		if (txt_password.isDisplayed() && txt_password.isEnabled())
		{
			txt_password.clear();
			txt_password.sendKeys(passwordtext);
		}
	}
	
	public void clickLoginButton()
	{
		if (btn_login.isDisplayed() && btn_login.isEnabled())
			btn_login.click();
	}
}
