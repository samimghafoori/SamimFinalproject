package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utlities.CommonUtility;


public class HomeSteps extends CommonUtility{
	 
	POMFactory factory = new POMFactory();
	
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().AllSection);
		logger.info("user click on All Section");
		
	}
	
	@Then("below options are present in Shop by Department sidebar")
    public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable options) {
        List<List<String>> DisplayOfOptions = options.asLists(String.class);
        Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text() = '" + DisplayOfOptions.get(0).get(0) + "']" ))));
               logger.info("options Electronics, Computers, Smart Home, Sports and Automative are present");
    }
		

      @Then("User change the category to {string}")
       public void userChangeTheCategoryTo(String value) {  
    	  selectByVisibleText(factory.homePage().allDepartment,value);
    	  logger.info("user change the category to SmartHome");
    
}
     @Then("User search for an item {string}")
      public void userSearchForAnItem(String value) {
    	 sendText(factory.homePage().SreachFiled,value);
    	 logger.info("user sreach for item");
    
}
      @Then("User click on Search icon")
      public void userClickOnSearchIcon() {
    	  click(factory.homePage().SreachButton);
    	  logger.info("user click on sreachbutton");
    
}
       @Then("User click on item")
       public void userClickOnItem() {
    	  click(factory.homePage().kasaoutdoorItem);
    	  logger.info("user click on sreachBar");
    
}
     
   

         @Then("User select quantity {string}")
          public void userSelectQuantity(String value) {
        	 selectByVisibleText(factory.homePage().SelectQuantity,value);
        	 logger.info("user select the Quantity");
        
        	 
        	 
         }    	 
        	 
        
         @Then("User click add to Cart button")
         public void userclickAddToCartButton() {
           
        	 click(factory.homePage().AddtoCard);
        	 logger.info("user adding the Item to the Card");
         }
         
    
           @Then("the cart icon quantity should change to {string}")
           public void theCartIconQuantityShouldChangeTo(String value) {
        	   Assert.assertTrue(isElementDisplayed(factory.homePage().CardShowingItme));
        	   logger.info("user conform that item added to the card");
   
}

     @And("User click on Cart option")
      public void userClickOnCartOption(){
	   click(factory.homePage().CardShowingItme);
	   logger.info("user click on CardOption Button");
	   
   }
	
   @And("User click on Proceed to Checkout button")
   public void userClickOnProceedToCheckoutButton() {
	   click(factory.homePage().ProceedButton);
	   logger.info("user click on proceedButton ");
	   
   }
	
	@And("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().AddNewAddress);
		logger.info("user click on add Address Link");
	}
	
	@And("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String,String>> AddingAddress = data.asMaps(String.class,String.class);
		selectByVisibleText(factory.homePage().SelectYourCountry,AddingAddress.get(0).get("country"));
		sendText(factory.homePage().EnterYourFullName,AddingAddress.get(0).get("fullName"));
		sendText(factory.homePage().EnterYourPhone,AddingAddress.get(0).get("phoneNumber"));
		sendText(factory.homePage().EnterYourStreetAddress,AddingAddress.get(0).get("streetAddress"));
		sendText(factory.homePage().EnterYourAPTNumber,AddingAddress.get(0).get("apt"));
		sendText(factory.homePage().EnterYourCityName,AddingAddress.get(0).get("city"));
		selectByVisibleText(factory.homePage().EnterYourStateName,AddingAddress.get(0).get("state"));
		sendText(factory.homePage().EnterYourZidCode,AddingAddress.get(0).get("zipCode"));
		logger.info("user adding the address for payment ");
		
		
	}
	
	@And("User click Add Your Address buttons")
	public void userClickAddYourAddressButtons() {
		click(factory.homePage().AddAddressButton);
		logger.info("user click on add address button");
		
	}
	
	@And("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().ChosePaymentMethod);
		logger.info("user click on adding any cards");
	}
	
	@And("User fill Debit or credit card informations")
	public void userFillDebetOrCreditCardInformations(DataTable data) {
	List<Map<String,String>> AddingCards = data.asMaps(String.class,String.class);
	sendText(factory.homePage().EnterYourCardNumber,AddingCards.get(0).get("cardNumber"));
	sendText(factory.homePage().EnterYourNameOnCard,AddingCards.get(0).get("nameOnCard"));
	sendText(factory.homePage().EnterYourExpritionYear,AddingCards.get(0).get("expirationYear"));
	sendText(factory.homePage().EnterYourExpritionMonth,AddingCards.get(0).get("expirationMonth"));
	sendText(factory.homePage().EnterYourSecCode,AddingCards.get(0).get("securityCode"));
	logger.info("user entered the above information");
	
	}
	
	@And("User click on Add your card buttons")
	public void userClickOnAddYourCardButtons() {
		click(factory.homePage().AddingTheCard);
		logger.info("user click on add card button");
		
		
	}
	
	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().PlaceOrderButton);
		logger.info("user click on place order button");
		
	}
	
	@Then("a message should be displayedi {string}")
	public void aMessageShouldBeDisplayedi(String value ) {
		waitTillPresence(factory.homePage().OrderPlacedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.homePage().OrderPlacedSuccessfully));
		logger.info("user confrom that order place Successfully present");
	}
	
	
	@And("User change the category too {string}")
	public void userChangeTheCategoryToo(String value) {
		selectByVisibleText(factory.homePage().allDepartment,value);
		logger.info("user change the category to the Electornic");
	
	}
	
	@And("User search for an items {string}")
	public void userSearchForAnItems(String value) {
		sendText(factory.homePage().SreachFiled,value);
		logger.info("user search for item Apex Legends ");
		
	}
	
	@And("User click on Search icons")
	public void userClickOnSearchIcons() {
		click(factory.homePage().SreachButton);
		logger.info("user click on SearchButton");
	}
	
	@And("User click on items")
	public void userClickOnItems() {
		click(factory.homePage().ApexLegends);
		logger.info("user click on item Apex Legends");
	}
	
	@And("User select quantitys {string}")
	public void userSelectQuantitys(String value) {
		selectByVisibleText(factory.homePage().SelectQuantity,value);
   	 logger.info("user select the Quantity");
   
	}
	
	@And("User click add to Cart buttons")
	 public void userClickAddToCartButtons() {
		 click(factory.homePage().AddtoCard);
    	 logger.info("user adding the Item to the Card");
	 
	}
	
	@Then("the cart icon quantity should change too {string}")
	public void TheCartIconQuantityShouldChangeToo(String value) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().CardShowingItme));
 	   logger.info("user conform that item added to the card");

	}
	
	@And("User click on Cart options")
	public void userClickOnCartOptions() {
	   click(factory.homePage().CardShowingItme);
	   logger.info("user click on Card option");
	
	}
	
	
	@And("User click on Proceed to Checkout buttons")
	public void userClickOnProceedToCheckoutButtons() {
		click(factory.homePage().ProceedButton);
		   logger.info("user click on proceedButton ");
	
	}
	
	@And("User click on Place Your Orders")
	public void userClickOnPlaceYourOrders() {
		click(factory.homePage().PlaceOrderButton);
		logger.info("user click on place order button");
		
	}
	
	@Then("a message should be displaye {string}")
	public void aMessageShouldBeDisplaye(String value) {
		waitTillPresence(factory.homePage().OrderPlacedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.homePage().OrderPlacedSuccessfully));
	}
	
	
	
	
	
	
	
	 
	
	String department;

	@When("User on {string}")

	public String userOnElectronics(String department) {

	switch (department) {

	case "Electronics":

	Assert.assertTrue(isElementDisplayed(factory.homePage().Elctronics));

	logger.info("user is on Electronics section");

	break;

	case "Computers":

	Assert.assertTrue(isElementDisplayed(factory.homePage().Computer));

	logger.info("user is on Computers section");

	break;

	case "Smart Home":

	Assert.assertTrue(isElementDisplayed(factory.homePage().SmartHome));

	logger.info("user is on Smart Home section");

	break;

	case "Sports":

	Assert.assertTrue(isElementDisplayed(factory.homePage().Sports));

	logger.info("user is on Sports section");

	break;

	case "Automotive":

	Assert.assertTrue(isElementDisplayed(factory.homePage().Autamative));

	logger.info("user is on Automotive section");

	break;

	default:

	}

	return this.department = department;

	}
	
	
	@Then("below options are present in department")

	public void belowOptionsArePresentInDepartment(DataTable dataTable) {

	List<List<String>> department = dataTable.asLists();

	switch (this.department) {

	case "Electronics":

	click(factory.homePage().Elctronics);

	

	String TVAndVideo = getText(factory.homePage().TvAndVideos);
	String video = getText(factory.homePage().VideoGames);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Assert.assertEquals(TVAndVideo, department.get(0).get(0));

	Assert.assertEquals(video, department.get(0).get(1));

	logger.info(video + " options are present in department" + TVAndVideo);

	break;

	case "Computers":

	click(factory.homePage().Computer);

	

	String Networking = getText(factory.homePage().Networking);
	String Accessories = getText(factory.homePage().Accessories);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
	Assert.assertEquals(Accessories, department.get(0).get(0));

	Assert.assertEquals(Networking, department.get(0).get(1));

	logger.info(Accessories + " options are present in department" + Networking);

	break;

	case "Smart Home":

	click(factory.homePage().SmartHome);

	String SmartHomeLightning = getText(factory.homePage().smarthomelightning);

	String PlugsandOutlets = getText(factory.homePage().plugsandoutlets);

	Assert.assertEquals(SmartHomeLightning, department.get(0).get(0));

	Assert.assertEquals(PlugsandOutlets, department.get(0).get(1));

	logger.info(SmartHomeLightning + " options are present in department" + PlugsandOutlets);

	break;

	case "Sports":

	click(factory.homePage().Sports);

	String AthleticClothing = getText(factory.homePage().AthleticClothing);

	String ExerciseFitness = getText(factory.homePage().ExerciseFitness);

	Assert.assertEquals(AthleticClothing, department.get(0).get(0));

	Assert.assertEquals(ExerciseFitness, department.get(0).get(1));

	logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);

	break;

	case "Automotive":

	click(factory.homePage().Autamative);

	String AutomativePartsAccessories = getText(factory.homePage().AutomativePartsAccessories);

	String MotorCyclePowersports = getText(factory.homePage().MotorCyclePowersports);

	Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));

	Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));

	logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);

	break; 
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


