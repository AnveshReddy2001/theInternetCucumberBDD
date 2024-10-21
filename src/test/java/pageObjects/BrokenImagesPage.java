package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenImagesPage {
    WebDriver driver;

    // Constructor
    public BrokenImagesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By images = By.tagName("img");

    // Methods
    public List<WebElement> getAllImages() {
        return driver.findElements(images);
    }

    // Method to verify if an image is broken
    public boolean isImageBroken(WebElement imageElement) {
        try {
            // Get the URL of the image
            String imageUrl = imageElement.getAttribute("src");

            // Create a URL connection
            URL url = new URL(imageUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();

            // Get the response code
            int responseCode = httpURLConnection.getResponseCode();
            System.out.println("Response code for image: " + imageUrl + " is " + responseCode);

            // Return true if the response code is not 200 (indicating the image is broken)
            return responseCode != 200;

        } catch (Exception e) {
            System.out.println("Error checking image: " + imageElement.getAttribute("src"));
            return true; // If an exception occurs, we assume the image is broken
        }
    }
}
