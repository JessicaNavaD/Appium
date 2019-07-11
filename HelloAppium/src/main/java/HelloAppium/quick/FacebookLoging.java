package helloAppium.quick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helloAppium.driver.BaseSetteting;
import io.appium.java_client.AppiumDriver;

public class FacebookLoging extends BaseSetteting {

	public FacebookLoging(AppiumDriver myDriver) {
		super(myDriver);
	}

	@FindBy(id = "m_login_email")
	private WebElement emailIn;

	@FindBy(id = "m_login_password")
	private WebElement passwordIn;

	@FindBy(id = "u_0_5")
	private WebElement logInBotton;

	public WebElement getEmailIn() {
		return emailIn;
	}

	public WebElement getPasswordIn() {
		return passwordIn;
	}

	public WebElement getLogInBotton() {
		return logInBotton;
	}

	public ConfirmLogIn loginFacebook(String email, String password) throws Throwable {
		Thread.sleep(5000);

		getEmailIn().sendKeys(email);

		getPasswordIn().sendKeys(password);

		getLogInBotton().click();
		return new ConfirmLogIn(getDriver());

	}
}
