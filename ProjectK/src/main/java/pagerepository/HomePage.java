package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// 1. WebElement Identification & Declaration

	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement fourthproduct;

	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement thirdproduct;

	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
	private WebElement secondproduct;

	// Identify Shopping cart icon
	@FindBy(className = "shopping_cart_link")
	private WebElement carticon;

	// Identify cart icon incremented 1
	@FindBy(xpath = "//span[text()='1']")
	private WebElement carticon1;

	// Identify cart icon incremented 2
	@FindBy(xpath = "//span[text()='2']")
	private WebElement carticon2;

	// Identify cart icon incremented 3
	@FindBy(xpath = "//span[text()='3']")
	private WebElement carticon3;

	// 2. WebElement Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// 3. WebElement Utilization
	public WebElement getfourthproduct() {
		return fourthproduct;
	}

	public WebElement getthirdproduct() {
		return thirdproduct;
	}

	public WebElement getsecondproduct() {
		return secondproduct;
	}

	public WebElement getcarticon() {
		return carticon;
	}

	public WebElement getCarticon1() {
		return carticon1;
	}

	public WebElement getCarticon2() {
		return carticon2;
	}

	public WebElement getCarticon3() {
		return carticon3;
	}
}
