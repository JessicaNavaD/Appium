package helloAppium.driver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class MYDriver {
	private AppiumDriver driver;

	public MYDriver(String platformName, String platformVersion, String deviceName) throws Throwable  {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.13.0");
		capabilities.setCapability("platformName",platformName );
		capabilities.setCapability("platformVersion", platformVersion);
		capabilities.setCapability("deviceName",deviceName );
		capabilities.setCapability("app", "C:\\Users\\jessica.nava\\Desktop\\Proyectos\\HelloAppium\\app\\quikr.apk");
		driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	public AppiumDriver getDriver() {
		return this.driver;
	}

	
}
