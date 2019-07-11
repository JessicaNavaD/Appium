package helloAppium.quick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helloAppium.driver.BaseSetteting;
import io.appium.java_client.AppiumDriver;

public class ConfirmLogIn extends BaseSetteting {
	
	public ConfirmLogIn(AppiumDriver myDriver) {
		super(myDriver);
	}

	@FindBy(id = "u_0_5")
	private WebElement logInBotton;

	public WebElement getLogInBotton() {
		return logInBotton;
	}
	
	public void confirLogIn() {
		logInBotton.click();
	}
}
