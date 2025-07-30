package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage1 {

	// 1. WebElement Identification & Declaration
	@FindBy(id = "add-to-cart")
	private WebElement addtocartbtn;

	@FindBy(id = "back-to-products")
	private WebElement backtoproducts;

	// 2. WebElement Initialization
	public ProductPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// 3. WebElement Utilization

	public WebElement getaddtocartbtn() {
		return addtocartbtn;
	}

	public WebElement getbacktoproducts() {
		return backtoproducts;
	}

}
