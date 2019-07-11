package helloAppium.quick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helloAppium.driver.BaseSetteting;
import io.appium.java_client.AppiumDriver;

public class Home extends BaseSetteting {

	public Home(AppiumDriver myDriver) {
		super(myDriver);

	}

	@FindBy(id = "sign_in_button")
	private WebElement googleBotton;

	@FindBy(id = "fb")
	private WebElement faceBookBotton;

	public WebElement getGoogleBotton() {
		return googleBotton;
	}

	public WebElement getFaceBookBotton() {
		return faceBookBotton;
	}

	public ChooseAccont getChooseGoogle() throws Throwable {
		Thread.sleep(5000);

		// getWait().until(ExpectedConditions.visibilityOf(googleBotton));
		googleBotton.click();
		return new ChooseAccont(getDriver());

	}

	public FacebookLoging getChooseFB() throws Throwable  {
		Thread.sleep(5000);

		// getWait().until(ExpectedConditions.visibilityOf(faceBookBotton));
		faceBookBotton.click();
		return new FacebookLoging(getDriver());

	}
}
