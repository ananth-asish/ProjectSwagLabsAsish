package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage2 {

	// 1. WebElement Identification & Declaration

	@FindBy(id = "add-to-cart")
	private WebElement addtocartbtn1;

	@FindBy(id = "back-to-products")
	private WebElement backtoproducts1;

	// 2. WebElement Initialization
	public ProductPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// 3. WebElement Utilization

	public WebElement getaddtocartbtn1() {
		return addtocartbtn1;
	}

	public WebElement getbacktoproducts1() {
		return backtoproducts1;
	}
}
