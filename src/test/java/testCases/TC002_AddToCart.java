package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddProductsToCart;
import testBase.BaseClass;

public class TC002_AddToCart extends BaseClass {

	@Test(groups = { "Master", "Sanity" })
	public void verify_AddToCart() throws InterruptedException {

		try {
			logger.info("-------Starting TC002_AddToCart-------");
			String product = p.getProperty("searchProductName");

			AddProductsToCart addCart = new AddProductsToCart(driver);
			addCart.clickAddToCart(product);
			addCart.verifyShoppingBag();
			Assert.assertTrue(true);

		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("-------Finished TC002_AddToCart-------");

	}
}
