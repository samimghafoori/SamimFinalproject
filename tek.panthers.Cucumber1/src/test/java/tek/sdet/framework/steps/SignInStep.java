package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utlities.CommonUtility;

public class SignInStep extends CommonUtility {
	
	POMFactory factory = new POMFactory();

	
	@Given("User is on retail website")
	public void userClickOnRetailWebsit() {
	String expctedTitle = "React App";
	String actualTitle = getTitle();
	Assert.assertEquals(expctedTitle, actualTitle);
	logger.info(actualTitle + " is equal to " + expctedTitle);
		
	}
  
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.signInPage().SignButton);
		logger.info("user click on login button");
	}
	
   
   @And("User enter email {string} and password {string}")
   public void userEnterEmailAndPassword(String email,String password) {
	   sendText(factory.signInPage().Eamil,email);
	   sendText(factory.signInPage().Password,password);
	   logger.info("user entered the above information");
	   
   }
   
   @And("User click on login button")
   public void userClickOnLoginButton() {
	   click(factory.signInPage().Login);
	   logger.info("user click on login button");
   }
   
   @Then("User should be logged in into Account")
   public void userShouldBeLoggedInIntoAccount() {
	   Assert.assertTrue(isElementDisplayed(factory.signInPage().Account));
	   logger.info("user logged to account");
   }
   
  @And("User click on Create New Account button")
  public void userClickOnCreateNewAccountButton() {
	  click(factory.signInPage().CreatingNewAccount);
	  logger.info("user click on new creating account button");
  }
   
 @And("User fill the signUp information with below data") 
 public void userFillTheSignUpInformationWithBelowData(DataTable data) {
	 
	 List<Map<String,String>> CreatingNewAccount = data.asMaps(String.class,String.class);
	 sendText(factory.signInPage().NameInput,CreatingNewAccount.get(0).get("name"));
	 sendText(factory.signInPage().EmailInput,CreatingNewAccount.get(0).get("email"));
	 sendText(factory.signInPage().PasswrodInput,CreatingNewAccount.get(0).get("password"));
	 sendText(factory.signInPage().ConfromPassInput,CreatingNewAccount.get(0).get("confirmPassword"));
	 logger.info("user entered the above information successfully");
	 
	 
 }
   
   
   @And("User click on SignUp button")
   public void userClickOnSignUpButton() {
	   click(factory.signInPage().SignUp);
	   logger.info("user click on sign up button");
   }
   
   @Then("User should be logged into account page")
   public void userShouldBeLoggedIntoAccountPage() {
	   Assert.assertTrue(isElementDisplayed(factory.signInPage().Account));
	   logger.info("user logged into account page");
   }
   

   
}
