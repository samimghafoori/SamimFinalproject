package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

   @FindBy(id = "orderLink")
   public WebElement OrderButton;
   
   @FindBy(xpath = "//button[text()='Cancel The Order']")
   public WebElement CancelOrderButton;
   
   @FindBy(id = "reasonInput")
   public WebElement ReasonForCancel;
   
   @FindBy(id = "orderSubmitBtn")
   public WebElement OrderCancelled;
   
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement YourOrderCancelledMessage;
	
	@FindBy(id = "returnBtn")
	public WebElement ReturnButton;
	
	@FindBy(xpath = "//select[@name='dropOff']")
	public WebElement DropOffSection;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement OrderReturnedButton;
	
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement ReturnWasSuccessfullyMessage;
	
	@FindBy(id = "reviewBtn")
	public WebElement ReviewButton;
	
	@FindBy(id = "headlineInput")
	public WebElement HeadLineInput;
	
	@FindBy(id = "descriptionInput")
	public WebElement WritenSection;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement ReviewSubmitButton;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement YourReviewSubmitedMessage;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
