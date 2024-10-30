package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisappearingElementsPage {
	WebDriver driver;

	public DisappearingElementsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By menuItems = By.cssSelector(".example ul li a");
	
	public List<String> getVisibleMenuItems(){
		List<WebElement> items = driver.findElements(menuItems);
		List<String> itemTexts = new ArrayList<>();
		for(WebElement item : items) {
			itemTexts.add(item.getText());
		}
		return itemTexts;
	}
	
}
