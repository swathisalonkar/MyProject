package testCases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AutomationPractice;
import testBase.BaseClass;

public class TC004_AlertTest extends BaseClass {

	@Test(groups = { "Master", "Automation" })
	public void verify_AlertTest() {
		try {

			logger.info("-------Starting TC004_AlertTest-------");
			AutomationPractice auto = new AutomationPractice(driver);
			auto.entername(randomString().toUpperCase());
			auto.clickAlertBtn();

			Alert alert = driver.switchTo().alert();
			alert.accept();

			auto.entername(randomString().toUpperCase());
			auto.clickConfirmBtn();
			alert.accept();

			auto.entername(randomString().toUpperCase());
			auto.clickConfirmBtn();
			alert.dismiss();

		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("-------Finished TC004_AlertTest-------");
	}

}
