package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage3 {

	// 1. WebElement Identification & Declaration

	@FindBy(id = "add-to-cart")
	private WebElement addtocartbtn2;

	@FindBy(id = "back-to-products")
	private WebElement backtoproducts2;

	// 2. WebElement Initialization
	public ProductPage3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// 3. WebElement Utilization

	public WebElement getaddtocartbtn2() {
		return addtocartbtn2;
	}

	public WebElement getbacktoproducts2() {
		return backtoproducts2;
	}
}
