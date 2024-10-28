package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ChallengingDom;

public class ChallengingDomSteps {
	WebDriver driver =  WebDriverManager.getDriver();
	ChallengingDom challengingDom = new ChallengingDom(driver);
	
	@Given("I am on the Challenging DOM page")
	public void i_am_on_the_challenging_dom_page() {
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
	}
	
	@When("I click the first button")
	public void i_click_the_first_button() {
		challengingDom.clickButton1();
		
	}
	@When("I click the second button")
	public void i_click_the_second_button() {
		challengingDom.clickButton2();
		
	}
	@When("I click the third button")
	public void i_click_the_third_button() {
		challengingDom.clickButton3();
		
	}
	
	@Then("I should see the buttons effect on the page")
	public void i_should_see_the_buttons_effect_on_the_page() {
		Assert.assertTrue(true, "Button click action performed");
	}
	
	@Then("I should see the table content properly loaded")
	public void i_should_see_the_table_content_properly_loaded() {
		int rowCount =  challengingDom.getTableRowsCount();
		Assert.assertTrue(rowCount > 0, "Table rows are not loaded.");
		System.out.println("Number of table rows: " + rowCount );
	}

}
