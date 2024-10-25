package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_ProductSearch extends BaseClass {

	@Test(groups = { "Master", "Sanity" })
	public void verify_ProductSearch() {

		try {
			logger.info("-------Starting TC001_ProductSearch-------");
			String product = p.getProperty("searchProductName");

			HomePage hp = new HomePage(driver);
			hp.enterProduct(product);
			hp.clickSearchBtn();
			hp.clearSearchBox();

		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("-------Finished TC001_ProductSearch-------");
	}

}
