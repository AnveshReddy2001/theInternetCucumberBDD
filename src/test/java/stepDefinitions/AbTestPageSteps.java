package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.AbTestPage;

public class AbTestPageSteps {
	WebDriver driver = WebDriverManager.getDriver();
	AbTestPage abTestPage = new AbTestPage(driver);

	@Given("I am on the A\\/B Testing page")
	public void i_am_on_the_a_b_testing_page() {
		driver.get("https://the-internet.herokuapp.com/abtest");
	}

	@Then("I should see the A\\/B Testing header")
	public void i_should_see_the_a_b_testing_header() {
		String headerText = abTestPage.getHeaderText();
		boolean isCorrectHeader = headerText.contains("A/B Test Control") || headerText.contains("A/B Test Variation 1");
		Assert.assertTrue(isCorrectHeader);
		

	}

	@Then("I should see the A\\/B Testing description")
	public void i_should_see_the_a_b_testing_description() {
		String descriptionText = abTestPage.getDescription();
		Assert.assertTrue(descriptionText.contains(
				"Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through)."),
				"A/B Testing description is incorrect!");

	}
}
