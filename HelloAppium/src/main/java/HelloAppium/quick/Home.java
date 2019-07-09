package helloAppium.quick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import helloAppium.driver.BaseSetteting;
import io.appium.java_client.AppiumDriver;

public class Home extends BaseSetteting {

	public Home(AppiumDriver myDriver) {
		super(myDriver);

	}

	@FindBy(id = "sign_in_button")
	private WebElement googleBotton;

	public WebElement getGoogleBotton() {
		return googleBotton;
	}

	public ChooseAccont getChooseGoogle() throws Throwable {
		Thread.sleep(5000);

		//getWait().until(ExpectedConditions.visibilityOf(googleBotton));
		googleBotton.click();
		return new  ChooseAccont(getDriver());

	}
}
