package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helloAppium.driver.MYDriver;
import helloAppium.quick.ConfirmLogIn;
import helloAppium.quick.SearchPage;
import helloAppium.quick.SelectCityHome;

public class HomeSearch {
	private SelectCityHome home;
	private MYDriver myDriver;
	private SearchPage search;

	@Given("^Launch Quikr app city$")
	public void launchQuikrApp() throws Throwable

	{
		myDriver = new MYDriver("Android", "9", "Nexus 6P API 28");
		home = new SelectCityHome(myDriver.getDriver());

	}

	@When("^The home select appear and select city$")
	public void theSearchAppears() throws Throwable {
		Thread.sleep(5000);

		search = home.getSearchCity();
		searchACity("bangalore");

	}

	@And("^Search a city$")
	public void searchACity(String name) throws Throwable {

		search.searchCityName(name);
	}

	@Then("^Select the city$")
	public void selectTheCity()throws Throwable {

		search.getSearchList().click();
		Thread.sleep(5000);

	}
}
