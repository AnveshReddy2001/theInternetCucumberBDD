package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ContextMenuPage;

public class ContextMenuPageSteps {
	WebDriver driver = WebDriverManager.getDriver();
	ContextMenuPage contextMenu = new ContextMenuPage(driver);
	
	@Given("I am on the Context Menu page")
	public void i_am_on_the_context_menu_page() {
		driver.get("https://the-internet.herokuapp.com/context_menu");
	}
	
	@When("I right-click on the hotspot")
	public void i_right_click_on_the_hotspot() {
		contextMenu.rightClickHotspot();
	}
	
	@Then("I should see an alert with text {string}")
		public void i_should_see_an_alert_with_text(String expectedText) { 
		String alertText = contextMenu.getAlertText();
		Assert.assertEquals(alertText, expectedText);
		contextMenu.acceptAlert();
	}
}
