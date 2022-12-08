package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailSignInHomePage extends BaseSetup {
	
	public RetailSignInHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "signinLink")
	public WebElement SignButton;
	
	@FindBy(id = "email")
	public WebElement Eamil;
	
	@FindBy(id = "password")
	public WebElement Password;
	
	@FindBy(id = "loginBtn")
	public WebElement Login;
	
	@FindBy(id = "accountLink")
	public WebElement Account;
	
	@FindBy(id = "newAccountBtn")
	public WebElement CreatingNewAccount;
	
	@FindBy(id = "nameInput")
	public WebElement NameInput;
	
	@FindBy(id = "emailInput")
	public WebElement EmailInput;
	
	@FindBy(id = "passwordInput")
	public WebElement PasswrodInput;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement ConfromPassInput;
	
	@FindBy(id = "signupBtn")
	public WebElement SignUp;
	
	@FindBy(id = "signinLink")
	public WebElement SignClick;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
