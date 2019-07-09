package steps;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.functions.ExpectedCondition;
import junit.framework.Assert;

public class HomePageSteps extends BaseCapabilities {

	

	
	 public HomePageSteps() throws Throwable {
		super();
	
	}
	private MobileElement el1;

	@When("^I launch Quikr app$")
	public void iLaunchQuikrApp() throws Throwable

	{

	}
	
	@And("^I choose to log in using Google$")
	public void ichoosetologinusingGoogle() throws Throwable
	{ 
		Thread.sleep(5000);
		
		el1 = (MobileElement) getDriver().findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
		getWait().until(ExpectedConditions.visibilityOf(el1));
		el1.click();

		iseeaccountpickerscreenwithmyemailaddress("jesynava@gmail.com");
		
	}
	@Then("^I see account picker screen with my email address \"([^\"]*)\"$")
	public void iseeaccountpickerscreenwithmyemailaddress (String expected)throws Throwable
	{
		Thread.sleep(5000);
	
		Assert.assertEquals(expected, el1.getText());
		
		el1.click();

	}
}
