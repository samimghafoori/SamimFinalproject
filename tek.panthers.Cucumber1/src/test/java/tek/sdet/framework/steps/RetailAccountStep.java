package tek.sdet.framework.steps;


import java.util.List;
import java.util.Map;
import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utlities.CommonUtility;

public class RetailAccountStep extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.retailAccountPage().Account);
		logger.info("user click on account button");
	    
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.signInPage().NameInput);
		sendText(factory.retailAccountPage().Name1,name);
		sendText(factory.retailAccountPage().PhoneNumber1,phone);
		logger.info("user entered the above information");
	    
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.retailAccountPage().UpdatedButt);
		logger.info("user click on update button");
	    
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.retailAccountPage().ProfileImage));
		logger.info("user conform that image profile updated");
	    
	}

	@And("User enter below information")
	public void userEnterBelowInfomation(DataTable data) {
		clearTextUsingSendKeys(factory.retailAccountPage().PrviousPass);
		List<Map<String,String>> UpdatingPass = data.asMaps(String.class,String.class);
		sendText(factory.retailAccountPage().PrviousPass,UpdatingPass.get(0).get("previousPassword"));
		sendText(factory.retailAccountPage().NewPass,UpdatingPass.get(0).get("newPassword"));
		sendText(factory.retailAccountPage().ConfPASS,UpdatingPass.get(0).get("confirmPassword"));
		logger.info("user enter the above information");
		
		
		
	}
	
	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.retailAccountPage().UpdatedButt);
		logger.info("user click on update button");
	}
	
	
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String MeassageUpdated) {
		waitTillPresence(factory.retailAccountPage().MessageUpdated);
		Assert.assertTrue(isElementDisplayed(factory.retailAccountPage().MessageUpdated));
		logger.info("profile updated ");
		
	}
	
	@And("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.retailAccountPage().AddMethodLink);
		logger.info("user click on add method link");
	}
	
	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String,String>> AddingBothCards = data.asMaps(String.class,String.class);
		sendText(factory.retailAccountPage().CardNumber,AddingBothCards.get(0).get("cardNumber"));
		sendText(factory.retailAccountPage().NameOnCard,AddingBothCards.get(0).get("nameOnCard"));
		selectByVisibleText(factory.retailAccountPage().ExpYearInput,AddingBothCards.get(0).get("expirationYear"));
		selectByVisibleText(factory.retailAccountPage().ExpMont,AddingBothCards.get(0).get("expirationMonth"));
		sendText(factory.retailAccountPage().SecCode,AddingBothCards.get(0).get("securityCode"));
		logger.info("user enter the above infromation");
		
		
	}
	
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.retailAccountPage().AddYourCardButton);
		logger.info("user click on add your card button");
		
	}
	
	@Then("a message should be displayeds {string}")
	public void aMessageShouldBeDisolayeds(String expctedMessage ) {
		waitTillPresence(  factory.retailAccountPage().paymentaddedsuccessfully);
		Assert.assertEquals(expctedMessage, factory.retailAccountPage().paymentaddedsuccessfully);
		logger.info(expctedMessage + " is displayed");
		
	}
	
	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.retailAccountPage().EditButt);
		logger.info("user click on Edit button");
		
	}
	
   @And("User click Master Card")
   public void userClickMasterCard() {
	   click(factory.retailAccountPage().SelectMasterCard);
	   logger.info("user click on Master Card");
	   
   }

	@And("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		clearTextUsingSendKeys(factory.retailAccountPage().CardNumber);
		clearTextUsingSendKeys(factory.retailAccountPage().NameOnCard);
		clearTextUsingSendKeys(factory.retailAccountPage().ExpYearInput);
		clearTextUsingSendKeys(factory.retailAccountPage().ExpMont);
		clearTextUsingSendKeys(factory.retailAccountPage().SecCode);
		List<Map<String,String>> UpdatingBothCards = data.asMaps(String.class,String.class);
		sendText(factory.retailAccountPage().NewCardNumber,UpdatingBothCards.get(0).get("cardNumber"));
		sendText(factory.retailAccountPage().NewNameOnCard,UpdatingBothCards.get(0).get("nameOnCard"));
		sendText(factory.retailAccountPage().NewExpYear,UpdatingBothCards.get(0).get("expirationYear"));
		sendText(factory.retailAccountPage().NewExpMonth,UpdatingBothCards.get(0).get("expirationMonth"));
		sendText(factory.retailAccountPage().NewSecCode,UpdatingBothCards.get(0).get("securityCode"));
		logger.info("user updated the above information correctlly");
		
		
	}
	
	@And("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.retailAccountPage().NewPaymentButton);
		logger.info("user click on add your card button");
		
	}
	
	@Then("a message should be displayedes {string}")
	public void aMessageShouldBeDisplayedes(String expctedMessages) {
		waitTillPresence(factory.retailAccountPage().paymentMethodUpdatedSuccessfully);
		Assert.assertEquals(expctedMessages, factory.retailAccountPage().paymentMethodUpdatedSuccessfully);
		
		
	}
	
	@And("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.retailAccountPage().AddAddressButton);
		logger.info("user click on add address option");
		
	}
	
	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String,String>> AddingAddress = data.asMaps(String.class,String.class);
		selectByVisibleText(factory.retailAccountPage().SelectCountry,AddingAddress.get(0).get("country"));
		sendText(factory.retailAccountPage().FullName1,AddingAddress.get(0).get("fullName"));
		sendText(factory.retailAccountPage().PhoneNum1,AddingAddress.get(0).get("phoneNumber"));
		sendText(factory.retailAccountPage().StreetAddress,AddingAddress.get(0).get("streetAddress"));
		sendText(factory.retailAccountPage().AptNumber,AddingAddress.get(0).get("apt"));
		sendText(factory.retailAccountPage().CityName,AddingAddress.get(0).get("city"));
		selectByVisibleText(factory.retailAccountPage().StateName,AddingAddress.get(0).get("state"));
		sendText(factory.retailAccountPage().ZipCode1,AddingAddress.get(0).get("zipCode"));
		logger.info("user entered the above information for adding address");
		
	}
	
	
	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.retailAccountPage().AddyourAddreess);
		logger.info("user click on add address button");
		
	}
	
	@Then("a message should be displayede {string}")
	public void aMessageShouldBeDisplayede(String expctedMessages) {
		waitTillPresence(factory.retailAccountPage().AddressAddedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.retailAccountPage().AddressAddedSuccessfully));
		logger.info("AddressAddedSuccessfully ");
		
		
		
	}
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.retailAccountPage().EditAddress);
		logger.info("user click on Edit Address button");
		
	}
	
	@And("user fill new address form with below informations")
	public void userFillNewAddressFormWithBelowInformations(DataTable data) {
		clearTextUsingSendKeys(factory.retailAccountPage().SelectCountry);
		clearTextUsingSendKeys(factory.retailAccountPage().FullName1);
		clearTextUsingSendKeys(factory.retailAccountPage().PhoneNum1);
		clearTextUsingSendKeys(factory.retailAccountPage().StreetAddress);
		clearTextUsingSendKeys(factory.retailAccountPage().AptNumber);
		clearTextUsingSendKeys(factory.retailAccountPage().CityName);
		clearTextUsingSendKeys(factory.retailAccountPage().StateName);
		clearTextUsingSendKeys(factory.retailAccountPage().ZipCode1);
		
		List<Map<String,String>> UpdatingAddress = data.asMaps(String.class,String.class);
		selectByVisibleText(factory.retailAccountPage().SelectCountry2,UpdatingAddress.get(0).get("country"));
		sendText(factory.retailAccountPage().FullName2,UpdatingAddress.get(0).get("fullName"));
		sendText(factory.retailAccountPage().PhoneNumber2,UpdatingAddress.get(0).get("phoneNumber"));
		sendText(factory.retailAccountPage().StreetAddress2,UpdatingAddress.get(0).get("streetAddress"));
		sendText(factory.retailAccountPage().AptNumber2,UpdatingAddress.get(0).get("apt"));
		sendText(factory.retailAccountPage().CityName2,UpdatingAddress.get(0).get("city"));
		selectByVisibleText(factory.retailAccountPage().StateName,UpdatingAddress.get(0).get("state"));
		sendText(factory.retailAccountPage().ZipCode2,UpdatingAddress.get(0).get("zipCode"));
		logger.info("user updated information ");
		
	}
	
	@And("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.retailAccountPage().AddyourAddreess);
		logger.info("user click on add your address button");
		
	}
	
	@Then("a message should be displayeded {string}")
	public void aMessageShouldBeDisplayeded(String expctedMessage) {
		waitTillPresence(factory.retailAccountPage().AddressUpdatedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.retailAccountPage().AddressUpdatedSuccessfully));
		
	}
	
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.retailAccountPage().RemoveAddress);
		logger.info("user removed the old address");
	   
	}
	
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		logger.info("user coform that address removed successfully");
	   
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
