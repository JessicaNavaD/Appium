package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helloAppium.driver.MYDriver;
import helloAppium.quick.ChooseAccont;
import helloAppium.quick.Home;

public class HomePageSteps {
	private Home home;
	private MYDriver myDriver;

	@When("^I launch Quikr app$")
	public void iLaunchQuikrApp() throws Throwable

	{
		myDriver = new MYDriver("Android", "9", "Nexus 6P API 28");
		home = new Home(myDriver.getDriver());

	}

	@And("^I choose to log in using Google$")
	public void ichoosetologinusingGoogle() throws Throwable {
		Thread.sleep(5000);
		//ChooseAccont accontToSelect = home.getChooseGoogle();
		ChooseAccont accontToSelect = new ChooseAccont(home.getDriver());
		Thread.sleep(5000);

		accontToSelect.getGmailText();

		iseeaccountpickerscreenwithmyemailaddress(accontToSelect.getGmailText().getText());

	}

	@Then("^I see account picker screen with my email address \"([^\"]*)\"$")
	public void iseeaccountpickerscreenwithmyemailaddress(String expected) throws Throwable {
		Thread.sleep(5000);

		 Assert.assertEquals(expected, "jesynava@gmail.com");
		 home.dispose();

		
	}
}
