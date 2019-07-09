package helloAppium.driver;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public abstract class BaseSetteting {
	private AppiumDriver driver;

	private WebDriverWait wait;

	public BaseSetteting(AppiumDriver myDriver) {
		PageFactory.initElements(myDriver, this);

		driver = myDriver;

	}

	public WebDriverWait getWait() {
		return wait;
	}

	public AppiumDriver getDriver() {
		return this.driver;
	}

	public void dispose() {
		if (driver != null) {
			driver.close();
		}
	}

}
