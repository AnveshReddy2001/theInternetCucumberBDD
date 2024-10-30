package stepDefinitions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.DisappearingElementsPage;

public class DisappearingElementsPageStpes {
	WebDriver driver = WebDriverManager.getDriver();
	DisappearingElementsPage disappearingElements = new DisappearingElementsPage(driver);
	
	@Given("I am on the Disappearing Elements page")
	public void i_am_on_the_disappearing_Elements_page() {
		driver.get("https://the-internet.herokuapp.com/disappearing_elements");
	}
	
	@Then("I should see all expected elements, if they are present")
	public void i_should_see_all_expected_elements_if_they_are_present() {
		List<String> expectedItems = Arrays.asList("Home", "About", "Contact Us", "Portfolio", "Gallery");
		List<String> visisbleItems = disappearingElements.getVisibleMenuItems();
		
		for(String item : expectedItems) {
			Assert.assertTrue(visisbleItems.contains(item) || !expectedItems.contains(item),
                    "Expected item not found: " + item);
			
			
		}
	}
}
