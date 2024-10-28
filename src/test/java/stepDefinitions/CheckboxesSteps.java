package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.CheckboxesPage;

public class CheckboxesSteps {
    WebDriver driver = WebDriverManager.getDriver();
    CheckboxesPage checkboxesPage = new CheckboxesPage(driver);

    @Given("I am on the Checkboxes page")
    public void i_am_on_the_checkboxes_page() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @When("I check the first checkbox if it is unchecked")
    public void i_check_the_first_checkbox_if_it_is_unchecked() {
        checkboxesPage.checkFirstCheckbox();
    }

    @Then("the first checkbox should be checked")
    public void the_first_checkbox_should_be_checked() {
        Assert.assertTrue(checkboxesPage.isFirstCheckboxSelected(), "First checkbox is not checked.");
    }

    @When("I uncheck the second checkbox if it is checked")
    public void i_uncheck_the_second_checkbox_if_it_is_checked() {
        checkboxesPage.uncheckSecondCheckbox();
    }

    @Then("the second checkbox should be unchecked")
    public void the_second_checkbox_should_be_unchecked() {
        Assert.assertFalse(checkboxesPage.isSecondCheckboxSelected(), "Second checkbox is not unchecked.");
    }
}
