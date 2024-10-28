package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChallengingDom {
	WebDriver driver;

	public ChallengingDom(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	 By Button1 = By.xpath("//a[contains(@class,'button') and not(contains(@class,'alert'))]");
	    By Button2 = By.xpath("//a[contains(@class,'button') and contains(@class,'alert')]");
	    By Button3 = By.xpath("//a[contains(@class,'button') and contains(@class,'success')]");
	
	By tableRows = By.xpath("//table/tbody/tr");
	
	public void clickButton1() {
		driver.findElement(Button1).click();
	}
	
	public void clickButton2() {
		driver.findElement(Button2).click();
	}
	
	public void clickButton3() {
		driver.findElement(Button3).click();
	}
	
	public int getTableRowsCount() {
		List<WebElement> rows = driver.findElements(tableRows);
		return rows.size();
	}
}
