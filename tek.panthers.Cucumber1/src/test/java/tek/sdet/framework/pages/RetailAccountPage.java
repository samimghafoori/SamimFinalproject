package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "accountLink")
	public WebElement Account;
	
	@FindBy(id = "nameInput")
	public WebElement Name1;
	
	@FindBy(id = "personalPhoneInput")
	public WebElement PhoneNumber1;
	
	@FindBy(xpath = "//button[text()='Change Password']")
	public WebElement UpdatedButt;
	
	@FindBy(id = "profileImage")
	public WebElement ProfileImage;
	
	@FindBy(id = "newPasswordInput")
	public WebElement NewPass;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement ConfPASS;
	
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement ChangePassButt;
	
	@FindBy(xpath = "//div[text()='Password Updated Successfully']" )
	public WebElement MessageUpdated;
	
	@FindBy(id = "previousPasswordInput")
	public WebElement PrviousPass;
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement AddMethodLink;
	
	@FindBy(id = "cardNumberInput")
	public WebElement CardNumber;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement NameOnCard;
	
	@FindBy(id = "expirationYearInput")
	public WebElement ExpYearInput;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement ExpMont;
	
	@FindBy(id = "securityCodeInput")
	public WebElement SecCode;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement AddYourCardButton;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentaddedsuccessfully;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement EditButt;
	
	@FindBy(id = "cardNumberInput")
	public WebElement NewCardNumber;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement NewNameOnCard;
	
	@FindBy(id = "expirationYearInput")
	public WebElement NewExpYear;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement NewExpMonth;
	
	@FindBy(id = "securityCodeInput")
	public WebElement NewSecCode;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement NewPaymentButton;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement paymentMethodUpdatedSuccessfully;
	
	@FindBy(xpath = "//div[@class='account__payment-sub']/p[text()='Master Card']")
	public WebElement SelectMasterCard;
	
	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement AddAddressButton;
	
	@FindBy(id = "countryDropdown")
	public WebElement SelectCountry;
	
	@FindBy(id = "fullNameInput")
	public WebElement FullName1;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement PhoneNum1;
	
	@FindBy(id = "streetInput")
	public WebElement StreetAddress;
	
	@FindBy(id = "apartmentInput")
	public WebElement AptNumber;
	
	@FindBy(id = "cityInput")
	public WebElement CityName;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement StateName;
	
	@FindBy(id = "zipCodeInput")
	public WebElement ZipCode1;
	
	@FindBy(id = "addressBtn")
	public WebElement AddyourAddreess;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement AddressAddedSuccessfully;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement EditAddress;
	
	@FindBy(id = "countryDropdown")
	public WebElement SelectCountry2;
	
	@FindBy(id = "fullNameInput")
	public WebElement FullName2;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement PhoneNumber2;
	
	@FindBy(id = "streetInput")
	public WebElement StreetAddress2;
	
	@FindBy(id = "apartmentInput")
	public WebElement AptNumber2;
	
	@FindBy(id = "cityInput")
	public WebElement CityName2;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement StateName2;
	
	@FindBy(id = "zipCodeInput")
	public WebElement ZipCode2;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement AddressUpdatedSuccessfully;
	
	
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement RemoveAddress;


	

}
