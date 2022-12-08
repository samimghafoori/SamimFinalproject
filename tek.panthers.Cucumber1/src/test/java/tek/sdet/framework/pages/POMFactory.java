package tek.sdet.framework.pages;
import tek.sdet.framework.base.BaseSetup;
import tek.sdet.framework.pages.RetailHomePage;
import tek.sdet.framework.pages.RetailSignInHomePage;


public class POMFactory extends BaseSetup {

	private RetailHomePage homePage;
	private RetailSignInHomePage signInPage;
	private RetailAccountPage retailAccountPage;
	private RetailOrderPage retailOrderPage;

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSignInHomePage();
		this.retailAccountPage = new RetailAccountPage();
		this.retailOrderPage = new RetailOrderPage();

	}

	public RetailHomePage homePage() {
		return this.homePage;

	}

	public RetailSignInHomePage signInPage() {
		return this.signInPage;
		
	}

	public RetailAccountPage retailAccountPage() {
		return this.retailAccountPage;
	}
  public RetailOrderPage retailOrderPage() {
	  return this.retailOrderPage;
  }
}
