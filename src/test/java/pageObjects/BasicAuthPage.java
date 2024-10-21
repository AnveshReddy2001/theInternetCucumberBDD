package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicAuthPage {
	WebDriver driver;

	public BasicAuthPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By successMesaage = By.cssSelector(".example p");
	
	public String getSuccessMessage() {
		return driver.findElement(successMesaage).getText();
	}

}
