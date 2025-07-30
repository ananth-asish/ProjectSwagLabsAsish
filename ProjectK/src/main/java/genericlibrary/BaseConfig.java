package genericlibrary;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import pagerepository.CheckoutCompletePage;
import pagerepository.LoginPage;
import pagerepository.LogoutPage;

public class BaseConfig {
	public WebDriver driver;
	public static  WebDriver staticDriver;
	// Step 1: Launch the browser
	@Parameters("browserName")
	@BeforeClass
	public void browserSetup(String browser) {
		// Step 1.1: Read browser from config
		
		// Step 1.2: Open browser
		driver = WebDriverLibrary.openBrowser(browser);
		staticDriver= driver;

		// Step 1.3: Maximize browser
		WebDriverLibrary.maximizeBrowser();

		// Step 1.4: Apply wait statement
		WebDriverLibrary.waitStatement();

		// Step 1.5: Navigate to application URL
		WebDriverLibrary.navigateToApp(PropertiesLibrary.readData("url"));

		// Step 1.6: Verify title
		Assert.assertEquals("Swag Labs", driver.getTitle());

		// Step 1.7: Log setup
		Reporter.log("Browser setup successful", true);
	}

	// Step 2: Login 
	@BeforeMethod
	public void login() {
		// Step 2.1: Wait for elements
		WebDriverLibrary.waitStatement();

		LoginPage lp = new LoginPage(driver);

		// Step 2.2: Verify username text field displayed
		Assert.assertTrue(lp.getusernametextfield().isDisplayed());

		// Step 2.3: Enter username
		
		WebDriverLibrary.enterTheData(lp.getusernametextfield(), PropertiesLibrary.readData("username"));

		// Step 2.4: Verify password text field displayed
		Assert.assertTrue(lp.getpasswordtextfield().isDisplayed());

		// Step 2.5: Enter password
		WebDriverLibrary.enterTheData(lp.getpasswordtextfield(), PropertiesLibrary.readData("password"));

		// Step 2.6: Verify login button is enabled
		Assert.assertTrue(lp.getloginbutton().isEnabled());

		// Step 2.7: Click login button
		WebDriverLibrary.elementClick(lp.getloginbutton());

		// Step 2.8: Verify home page
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

		// Step 2.9: Log login
		Reporter.log("Application Login successful", true);
	}

	// Step 3: Logout
	@AfterMethod
	public void logout() {
		// Step 3.1: Wait for elements
		WebDriverLibrary.waitStatement();

		LogoutPage lop = new LogoutPage(driver);
		CheckoutCompletePage ccp = new CheckoutCompletePage(driver);

		// Step 3.2: Click 'Back to Home' 
		Assert.assertTrue(ccp.getback2prod().isEnabled());
		WebDriverLibrary.elementClick(ccp.getback2prod());

		// Step 3.3: Verify home page
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

		// Step 3.4: Click hamburger menu
		Assert.assertTrue(lop.getMenubar().isEnabled());
		WebDriverLibrary.elementClick(lop.getMenubar());

		// Step 3.5: Click logout
		Assert.assertTrue(lop.getLogout().isEnabled());
		WebDriverLibrary.elementClick(lop.getLogout());

		// Step 3.6: Log logout
		Reporter.log("Application log out successful", true);
	}

	// Step 4: Terminate browser
	@AfterClass
	public void browserterminate() {
		// Step 4.1: Close all browser windows
		WebDriverLibrary.closeAllWindow();

		// Step 4.2: Log termination
		Reporter.log("Browser Termination successful", true);
	}

	// Step 5: Provide checkout data
	@DataProvider
	public Object[][] checkOutInfo() {
		// Step 5.1: Read data from Excel
		Object[][] data = new Object[1][3];
		data[0][0] = ExcelLibrary.readData("CO_Details", 1, 0);
		data[0][1] = ExcelLibrary.readData("CO_Details", 1, 1);
		data[0][2] = ExcelLibrary.readData("CO_Details", 1, 2);
		return data;
	}

}
