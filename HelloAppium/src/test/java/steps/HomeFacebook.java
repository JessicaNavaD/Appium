package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helloAppium.driver.MYDriver;
import helloAppium.quick.ChooseAccont;
import helloAppium.quick.ConfirmLogIn;
import helloAppium.quick.FacebookLoging;
import helloAppium.quick.Home;

public class HomeFacebook {

	private Home home;
	private MYDriver myDriver;

	@Given("^launch Quikr app$")
	public void launchQuikrApp() throws Throwable

	{
		myDriver = new MYDriver("Android", "9", "Nexus 6P API 28");
		home = new Home(myDriver.getDriver());

	}

	@When("^The loging appears$")
	public void theLogingAppears() throws Throwable
	{
		Thread.sleep(5000);
	home.getFaceBookBotton().click();
	FacebookLoging facebookLoging = new FacebookLoging(home.getDriver());
	iChooseLogingFacebookAccount(facebookLoging);
	
	}

	@And("^I choose loging a facebook account$")
	public void iChooseLogingFacebookAccount(FacebookLoging facebookLoging) throws Throwable {
		Thread.sleep(5000);
	
		
		ConfirmLogIn confirmLogIn = facebookLoging.loginFacebook("jesy2010@live.com.mx", "loyou2bb");

		

	}

	@Then("^I log in with Facebook$")
	public void iLogInWithFacebook(	ConfirmLogIn confirmLogIn) throws Throwable {
		 confirmLogIn.confirLogIn();
		 
		Thread.sleep(5000);


	}

}
