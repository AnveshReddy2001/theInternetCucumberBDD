package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbTestPage {
	WebDriver driver;

	public AbTestPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By header = By.tagName("h3");
	By description = By.tagName("p");
	
	
	public String getHeaderText() {
		return driver.findElement(header).getText();
	}
	
	public String getDescription() {
		return driver.findElement(description).getText();
	}

}
