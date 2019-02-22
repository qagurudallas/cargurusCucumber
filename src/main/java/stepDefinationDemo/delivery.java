package stepDefinationDemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class delivery {
	@Given("^I am a delivery person and using an app to find out the correct amount to be charged to the customer\\.$")
	public void openBrowser() throws Exception {
	  
	}

	@When("^distance is under (\\d+) KM$")
	public void distance_is_under_10_KM(int arg1) throws Exception {
	}

	@Then("^Delivery price is \\$(\\d+) WHEN$")
	public void delivery_price_is_$_WHEN(int arg1) throws Exception {
	 
	}


}
