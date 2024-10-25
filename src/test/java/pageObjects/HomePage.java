package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@type='search']")
	WebElement txtSearchBox;
	@FindBy(xpath = "//button[@class='search-button']")
	WebElement btnSearch;

	public void enterProduct(String pName) {
		txtSearchBox.sendKeys(pName);
	}
	
	public void clearSearchBox() {
		txtSearchBox.clear();
	}

	public void clickSearchBtn() {
		btnSearch.click();
	}

}
