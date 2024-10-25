package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductsToCart extends BasePage {

	public AddProductsToCart(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='product']//h4[@class='product-name']")
	List<WebElement> productList;
	@FindBy(xpath = "//div[@class='product-action']/button")
	List<WebElement> btnAddToCart;
	@FindBy(xpath = "//img[@alt='Cart']")
	WebElement shoppingBag;

	public void clickAddToCart(String pName) {

		for (int i = 0; i < productList.size(); i++) {
			WebElement prod = productList.get(i);
			if (prod.getText().contains(pName)) {
				WebElement button = btnAddToCart.get(i);
				button.click();
			}
		}
	}

	public void verifyShoppingBag() {
		shoppingBag.click();
	}

}