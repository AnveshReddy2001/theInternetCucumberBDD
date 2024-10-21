package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.BasicAuthPage;

public class BasicAuthPageSteps {
	WebDriver driver = WebDriverManager.getDriver();
	BasicAuthPage basicAuthPage = new BasicAuthPage(driver);
	
	@Given("I am on the Basic Auth page with valid credentials")
	public void i_am_on_the_basic_auth_page_with_valid_credentials() {
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	
	@Then("I should see a success message")
	public void i_should_see_a_success_message() {
		String successMessage = basicAuthPage.getSuccessMessage();
		Assert.assertTrue(successMessage.contains("Congratulations! You must have the proper credentials."), "Success message is incorrect");
	}

}
