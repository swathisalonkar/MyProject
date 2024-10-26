package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ApplicationFill extends BasePage {

	public ApplicationFill(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "name")
	WebElement sName;
	@FindBy(name = "email")
	WebElement sEmail;
	@FindBy(id = "exampleInputPassword1")
	WebElement sPwd;
	@FindBy(id = "exampleCheck1")
	WebElement checkIcecream;
	@FindBy(id = "exampleFormControlSelect1")
	WebElement sGender;
	@FindBy(id = "inlineRadio1")
	WebElement radioStudent;
	@FindBy(id = "inlineRadio2")
	WebElement radioEmployed;
	@FindBy(xpath = "//input[@name='bday']")
	WebElement sDOB;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement btnSubmit;

	public void enterName(String name) {
		sName.sendKeys(name);
	}

	public void enterEmail(String email) {
		sEmail.sendKeys(email);
	}

	public void enterPwd(String pwd) {
		sPwd.sendKeys(pwd);
	}

	public void selectCheckBox() {
		checkIcecream.click();
	}

	public void selectGender(String gender) {
		Select sel = new Select(sGender);
		sel.selectByVisibleText(gender);
	}

	public void selectStudent() {
		radioStudent.click();
	}

	public void selectEmployed() {
		radioEmployed.click();
	}

	public void enterDOB(String dob) {
		sDOB.sendKeys(dob);
	}

	public void clickSubmit() {
		btnSubmit.click();
	}

}
