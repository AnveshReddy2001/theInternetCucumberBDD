package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DragAndDropPage;

public class DragAndDropPageSteps {
	WebDriver driver = WebDriverManager.getDriver();
	DragAndDropPage dragAndDrop = new DragAndDropPage(driver);
	
	@Given("I am on Drag and Drop page")
	public void i_am_on_drag_and_drop_page() {
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	}
	
	@When("I drag element A and drop it on element B")
	public void i_drag_element_a_and_drop_it_on_element_b() {
		dragAndDrop.dragAndDrop();
	}
	
	@Then("element A should be placed in the position of element B")
	public void element_a_should_be_placed_in_the_position_of_element_b() {
		String columnAText = dragAndDrop.getColumnAText();
		String columnBText = dragAndDrop.getColumnBText();
		
		Assert.assertEquals(columnAText, "B");
		Assert.assertEquals(columnBText, "A");
	}
}
