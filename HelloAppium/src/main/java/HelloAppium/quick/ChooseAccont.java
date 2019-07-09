package helloAppium.quick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helloAppium.driver.BaseSetteting;
import io.appium.java_client.AppiumDriver;

public class ChooseAccont extends BaseSetteting{
	public ChooseAccont(AppiumDriver myDriver) {
		super(myDriver);

	}

	@FindBy(id = "text1")
	private WebElement gmailText;

	public WebElement getGmailText() {
		return gmailText;
	}


	

}
