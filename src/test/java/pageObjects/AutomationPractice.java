package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPractice extends BasePage {

	public AutomationPractice(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "name")
	WebElement aName;
	@FindBy(id = "alertbtn")
	WebElement btnAlert;
	@FindBy(id = "alertbtn")
	WebElement btnConfirm;

	public void entername(String name) {
		aName.sendKeys(name);
	}

	public void clickAlertBtn() {
		btnAlert.click();
	}

	public void clickConfirmBtn() {
		btnConfirm.click();
	}

}
