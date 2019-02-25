package stepDefinationDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//git
public class SearchforcarbyzipcodeSteps {
	WebDriver driver = null;

	@Given("^User is on cargurus page$")
	public void user_is_on_cargurs_page() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.cargurus.com");

	}
	
	

	@When("^user enter (.*) and click search_button$")
	public void user_enter_zipcode_and_click_search_button(String zipcode) throws Exception {
		WebElement tab3 = driver.findElement(By.id("heroSearch-tab-2"));

		tab3.click();
		driver.findElement(By.id("dealFinderZipCPOId")).sendKeys(zipcode);
		driver.findElement(By.id("dealFinderFormCPO_0")).click();
	}

	@Then("^page displays (.*) heading$")
	public void page_displays_with_correct_city_heading(String city) throws Exception {
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains(city));
	}
	@And("^User can see cars$")
	public void user_can_see_carsname() {
		
		driver.close();
	}
}
