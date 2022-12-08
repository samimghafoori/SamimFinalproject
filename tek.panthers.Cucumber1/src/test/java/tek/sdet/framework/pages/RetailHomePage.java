package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}

	@FindBy(xpath = "//span[text()='All']")
	public WebElement AllSection;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement Elctronics;
	
	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement Computer;
	
	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement SmartHome;
	
	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement Sports;
	
	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement Autamative;
	
	@FindBy(id = "searchInput")
	public WebElement SearchBar;
	
	@FindBy(id = "searchInput")
	public WebElement SreachFiled;
	
	@FindBy(id = "searchBtn")
	public WebElement SreachButton;
	
    @FindBy(xpath = "//select[@class='product__select']")
    public WebElement SelectQuantity;
    
    @FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
    public WebElement kasaoutdoorItem;
    
    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement AddtoCard;
    
    @FindBy(xpath = "//p[text()='Cart ']")
    public WebElement CardShowingItme;
    
    @FindBy(id = "search")
    public WebElement allDepartment;
	
	
	@FindBy(id = "proceedBtn")
	public WebElement ProceedButton;
	
	@FindBy(id = "addAddressBtn")
	public WebElement AddNewAddress;
	
	@FindBy(id = "countryDropdown")
	public WebElement SelectYourCountry;
	
	@FindBy(id = "fullNameInput")
	public WebElement EnterYourFullName;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement EnterYourPhone;
	
	@FindBy(id = "streetInput")
	public WebElement EnterYourStreetAddress;
	
	@FindBy(id = "apartmentInput")
	public WebElement EnterYourAPTNumber;
	
	@FindBy(id = "cityInput")
	public WebElement EnterYourCityName;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement EnterYourStateName;
	
	@FindBy(id = "zipCodeInput")
	public WebElement EnterYourZidCode;
	
	@FindBy(id = "addressBtn")
	public WebElement AddAddressButton;
	
	@FindBy(id = "addPaymentBtn")
	public WebElement ChosePaymentMethod;
	
	@FindBy(id = "cardNumberInput")
	public WebElement EnterYourCardNumber;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement EnterYourNameOnCard;
	
	@FindBy(id = "expirationYearInput")
	public WebElement EnterYourExpritionYear;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement EnterYourExpritionMonth;
	
	@FindBy(id = "securityCodeInput")
	public WebElement EnterYourSecCode;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement AddingTheCard;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement PlaceOrderButton;
	
	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	public WebElement OrderPlacedSuccessfully;
	
	@FindBy(xpath = "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement ApexLegends;
	
	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement OrderPlacedThanks;
	
	@FindBy(xpath="//span[text()='TV & Video']")
	public WebElement TvAndVideos;
	
	@FindBy(xpath="//span[text()='Video Games']")

	public WebElement VideoGames;

	@FindBy(xpath="//span[text()='Accessories']")

	public WebElement Accessories;

	@FindBy(xpath="//span[text()='Networking']")

	public WebElement Networking;

	@FindBy(xpath="//span[text()='Smart Home Lightning']")

	public WebElement smarthomelightning;

	@FindBy(xpath="//span[text()='Plugs and Outlets']")

	public WebElement plugsandoutlets;

	@FindBy(xpath="//span[text()='Athletic Clothing']")

	public WebElement AthleticClothing;

	@FindBy(xpath="//span[text()='Exercise & Fitness']")

	public WebElement ExerciseFitness;

	@FindBy(xpath="//span[text()='Automative Parts & Accessories']")

	public WebElement AutomativePartsAccessories;

	@FindBy(xpath="//span[text()='MotorCycle & Powersports']")

	public WebElement MotorCyclePowersports;
	
	
}
