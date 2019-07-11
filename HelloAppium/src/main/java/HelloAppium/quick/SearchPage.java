package helloAppium.quick;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helloAppium.driver.BaseSetteting;
import io.appium.java_client.AppiumDriver;

public class SearchPage extends BaseSetteting {
	

	public SearchPage(AppiumDriver myDriver) {
		super(myDriver);

	}

	@FindBy(id = "search_ET")
	private WebElement searchText;
	@FindBy(className= "android.widget.FrameLayout")
	private WebElement searchList;
	
	
	public WebElement getSearchText() {
		return searchText;
	}


	public WebElement getSearchList() {
		return searchList;
	}


	public void searchCityName(String name) throws Throwable{
		searchText.sendKeys(name);
		
		
	}

}
