package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ApplicationFill;
import testBase.BaseClass;

public class TC003_ProtractorApplicationTest extends BaseClass {

	@Test(groups = { "Master", "Sanity" })
	public void verify_PracticeForm() {

		try {
			logger.info("-------Started TC003_ProtractorApplicationTest-------");

			ApplicationFill appli = new ApplicationFill(driver);
			appli.enterName(randomString().toUpperCase());
			appli.enterEmail(p.getProperty("email"));
			appli.enterPwd(p.getProperty("password"));
			appli.selectCheckBox();
			appli.selectGender("Male");
			appli.selectEmployed();
			appli.enterDOB("01-01-2000");
			appli.clickSubmit();

			System.out.println("Application filled successfully");
			Assert.assertTrue(true);

		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("-------Finished TC003_ProtractorApplicationTest-------");
	}
}
