package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.BrokenImagesPage;

public class BrokenImagesPageSteps {
	WebDriver driver = WebDriverManager.getDriver();
	BrokenImagesPage brokenImagesPage = new BrokenImagesPage(driver);
	
	@Given("I am on the Broken Images page")
	public void i_am_on_the_broken_images_page() {
		driver.get("https://the-internet.herokuapp.com/broken_images");
	}
	
	@Then("I should see all images properly loaded")
	public void i_should_see_all_images_properly_loaded() {
		List<WebElement> images = brokenImagesPage.getAllImages();
		int brokenImagesCount = 0;
		int validImagesCount = 0;
		for (WebElement image : images) {
            boolean isBroken = brokenImagesPage.isImageBroken(image);
            if (isBroken) {
                brokenImagesCount++;
                System.out.println("Broken image URL: " + image.getAttribute("src"));
            } else {
                validImagesCount++;
                System.out.println("Valid image URL: " + image.getAttribute("src"));
            }
        }

        // Log the number of valid and broken images
        System.out.println("Number of valid images: " + validImagesCount);
        System.out.println("Number of broken images: " + brokenImagesCount);

        // Assert that there are 2 broken images and 1 valid image
        Assert.assertEquals(brokenImagesCount, 2, "Number of broken images is incorrect!");
        Assert.assertEquals(validImagesCount, 2, "Number of valid images is incorrect!");
		
	}
}
