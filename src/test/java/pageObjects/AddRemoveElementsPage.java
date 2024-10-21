package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage {	
	WebDriver driver;

	public AddRemoveElementsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By addElement = By.xpath("//*[@id=\"content\"]/div/button");
	By delete =  By.cssSelector(".added-manually");
	
	public void clickAddElementButton() {
		driver.findElement(addElement).click();
	}
	
	public int getDeleteButtonsCount() {
		List<?> deleteButtonList = driver.findElements(delete);
		return deleteButtonList.size();
	}
	
	public void clickDeleteButton() {
		driver.findElement(delete).click();
	}
}
