package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesPage {
	WebDriver driver;

	public CheckboxesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By checkbox1 = By.xpath("(//input[@type = 'checkbox'])[1]");
	By checkbox2 = By.xpath("(//input[@type = 'checkbox'])[2]");
	
	public boolean isFirstCheckboxSelected() {
		return driver.findElement(checkbox1).isSelected();
	}
	
	public boolean isSecondCheckboxSelected() {
		return driver.findElement(checkbox2).isSelected();
		
	}
	
	public void checkFirstCheckbox() {
		WebElement checkbox = driver.findElement(checkbox1);
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
	}
	
	public void uncheckSecondCheckbox() {
		WebElement checkbox = driver.findElement(checkbox2);
		if(checkbox.isSelected()) {
			checkbox.click();
		}
	}
}
