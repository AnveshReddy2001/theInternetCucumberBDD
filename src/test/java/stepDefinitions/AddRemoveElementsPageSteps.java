package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddRemoveElementsPage;

public class AddRemoveElementsPageSteps {
    WebDriver driver = WebDriverManager.getDriver();
    AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(driver);

    @Given("I am on the Add\\/Remove Elements page")
    public void i_am_on_the_add_remove_elements_page() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    @When("I add {int} elements")
    public void i_add_elements(int count) {
        for (int i = 0; i < count; i++) {
            addRemoveElementsPage.clickAddElementButton();
        }
    }

    @Then("I should see {int} delete buttons")
    public void i_should_see_delete_buttons(int expectedCount) {
        int actualCount = addRemoveElementsPage.getDeleteButtonsCount();
        Assert.assertEquals(actualCount, expectedCount, "Number of delete buttons is incorrect!");
    }

    @When("I remove {int} elements")
    public void i_remove_elements(int count) {
        for (int i = 0; i < count; i++) {
            addRemoveElementsPage.clickDeleteButton();
        }
    }
}
