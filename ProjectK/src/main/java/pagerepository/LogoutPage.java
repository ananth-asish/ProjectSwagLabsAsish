package pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	// 1. WebElement Identification and Declaration
	@FindBy(id = "react-burger-menu-btn")
	private WebElement menubar;

	@FindBy(id = "logout_sidebar_link")
	private WebElement logout;

	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public WebElement getMenubar() {
		return menubar;
	}

	public WebElement getLogout() {
		return logout;
	}

}
