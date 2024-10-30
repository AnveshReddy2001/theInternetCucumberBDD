package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {
	WebDriver driver;

	public DragAndDropPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By A = By.id("column-a");
	By B = By.id("column-b");
	
	public void dragAndDrop() {
		WebElement a = driver.findElement(A);
		WebElement b = driver.findElement(B);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(a, b).perform();
	}
	
	public String getColumnAText() {
		return driver.findElement(A).getText();
	}
	
	public String getColumnBText() {
		return driver.findElement(B).getText();
	}
}
