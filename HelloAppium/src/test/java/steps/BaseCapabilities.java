package steps;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public abstract class BaseCapabilities {
	private AppiumDriver driver;

	private WebDriverWait wait;

	public WebDriverWait getWait() {
		return wait;
	}

	public BaseCapabilities() throws Throwable {
		driver = this.driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.13.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("deviceName", "Nexus 6P API 28");
		capabilities.setCapability("app", "C:\\Users\\jessica.nava\\Desktop\\Proyectos\\HelloAppium\\app\\quikr.apk");
		driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	public AppiumDriver getDriver() {
		return driver;
	}

	public void dispose() {
		if (driver != null) {
			driver.close();
		}
	}

}
