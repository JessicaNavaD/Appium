package helloAppium.quick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helloAppium.driver.BaseSetteting;
import io.appium.java_client.AppiumDriver;

public class SelectCityHome extends BaseSetteting {
	public SelectCityHome(AppiumDriver myDriver) {
		super(myDriver);

	}

	@FindBy(id = "citySpinner")
	private WebElement selectCityBotton;

	public WebElement getSelectCityBotton() {
		return selectCityBotton;
	}

	public SearchPage getSearchCity() {
		selectCityBotton.click();
		return new SearchPage(getDriver());

	}

}
