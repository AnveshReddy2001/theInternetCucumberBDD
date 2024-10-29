package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.DigestAuthPage;

public class DigestAuthPageSteps {
	WebDriver driver = WebDriverManager.getDriver();
	DigestAuthPage digestAuth = new DigestAuthPage(driver);
	
	@Given("I am on the Digest Authentication page with valid credentials")
	public void i_am_on_the_digest_authentication_page_with_valid_credentials() {
		String userName = "admin";
		String password = "admin";
		digestAuth.navigateToDigestAuthPageWithCredentials(userName, password);
	}
	
	@Then("I should see a message {string}")
	public void i_should_see_a_message(String expectedText) {
		String successMessage = digestAuth.getSuccessMessage();
		Assert.assertEquals(successMessage, expectedText);
		
	}

}
