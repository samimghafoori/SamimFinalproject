package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utlities.CommonUtility;

public class RetailOrderStep extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.retailOrderPage().OrderButton);
		logger.info("user click on Order button");
	}
  @And("User click on first order in list")
  public void userClickOnFirstOrderInList() {
	  click(factory.homePage().ApexLegends);
	  logger.info("user click on first item on the list");
  }
  
  
   @And("User click on Cancel The Order button")
   public void userClickOnCancelTheOrderButton() {
	   click(factory.retailOrderPage().CancelOrderButton);
	   logger.info("user click on Cancel Order Button");
   }
  
  @And("User select the cancelation Reason {string}")
  public void userSelectTheCancelationReason(String value) {
	  selectByVisibleText(factory.retailOrderPage().ReasonForCancel,value);
	  logger.info("user selected the Reason for cancelation");
	  
  }
  
  @And("User click on Cancel Order button")
  public void userClickOnCancelOrderButton() {
	  click(factory.retailOrderPage().OrderCancelled);
	  logger.info("user click on order cancelled button");
  }
  
  @Then("a cancelation message should be displayed {string}")
  public void aCancelationMessageShouldBeDisplayed(String value) {
	  waitTillPresence(factory.retailOrderPage().YourOrderCancelledMessage);
	  Assert.assertTrue(isElementDisplayed(factory.retailOrderPage().YourOrderCancelledMessage));
  }
  
  @And("User click on Return Items button")
  public void userClickOnReturnItemsButton() {
	  click(factory.retailOrderPage().ReturnButton);
	  logger.info("user click on Order Return button");
  }
  
  @And("User select the Return Reason {string}")
  public void userSelectTheReturnReason(String value) {
	  selectByVisibleText(factory.retailOrderPage().ReasonForCancel,value);
	  logger.info("user selected the Reason of Returning");
	  
  }
  
  @And("User select the drop off service {string}")
  public void userSelectTheDropOffService(String value) {
	  selectByVisibleText(factory.retailOrderPage().DropOffSection,value);
	  logger.info("user selected the drop off Services");
	  
  }
  
  @And("User click on Return Order button")
  public void userClickOnReturnOrderButton() {
	  click(factory.retailOrderPage().OrderReturnedButton);
	  logger.info("user click on Order Return Button");
  }
  
  @Then("a cancelation message should be displayeds {string}")
  public void aCancelationMessageShouldBeDispayeds(String value) {
	  waitTillPresence(factory.retailOrderPage().ReturnWasSuccessfullyMessage);
	  Assert.assertTrue(isElementDisplayed(factory.retailOrderPage().ReturnWasSuccessfullyMessage));
	  
  }
  
  @And("User click on Review button")
  public void userClickOnReviewButton() {
	  click(factory.retailOrderPage().ReviewButton);
	  logger.info("user click on Review button");
  }
  
  @And("User write Review headline {string} and {string}")
  public void userWriteReviewHeadLineAnd(String value,String value1) {
	  sendText(factory.retailOrderPage().HeadLineInput,value);
	  sendText(factory.retailOrderPage().WritenSection,value1);
	  logger.info("user wrote something about the product which bought");
  }
  
  @And("User click Add your Review button")
  public void userClickAddYourReviewButton() {
	  click(factory.retailOrderPage().ReviewSubmitButton);
	  logger.info("user click on submite Review button");
  }
  
  @Then("a review message should be displayed {string}")
  public void aReviewMessageShouldBeDisplayed(String value) {
	  waitTillPresence(factory.retailOrderPage().YourReviewSubmitedMessage);
	  Assert.assertTrue(isElementDisplayed(factory.retailOrderPage().YourReviewSubmitedMessage));
  }
  
  
  
  
  
}
