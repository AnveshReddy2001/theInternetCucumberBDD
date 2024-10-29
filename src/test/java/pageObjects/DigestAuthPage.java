package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DigestAuthPage {
	WebDriver driver;

	public DigestAuthPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By successMessage = By.cssSelector("p");
	
	public void navigateToDigestAuthPageWithCredentials(String userName, String password) {
		String url = "https://" + userName + ":" + password + "@the-internet.herokuapp.com/digest_auth";
		driver.get(url);
	}
	
	public String getSuccessMessage() {
		return driver.findElement(successMessage).getText();
	}
}
