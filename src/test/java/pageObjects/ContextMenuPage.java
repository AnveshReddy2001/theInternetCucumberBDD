package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextMenuPage {
	WebDriver driver;

	public ContextMenuPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By hotspot = By.id("hot-spot");

	public void rightClickHotspot() {
		
		Actions actions = new Actions(driver);
		actions.contextClick(driver.findElement(hotspot)).perform();
	}

	public String getAlertText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void acceptAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
