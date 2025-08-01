package producttest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlibrary.BaseConfig;
import genericlibrary.WebDriverLibrary;
import pagerepository.CartPage;
import pagerepository.CheckoutOverviewPage;
import pagerepository.CheckoutPage;
import pagerepository.HomePage;
import pagerepository.ProductPage1;
import pagerepository.ProductPage2;
import pagerepository.ProductPage3;

@Listeners(listenerlibrary.ListenerImplementation.class)
public class Example1Test extends BaseConfig {

	@Test(dataProvider = "checkOutInfo", priority = 1, invocationCount = 1)
	public void Verify_If_User_Is_Able_To_Order_3_Products(String firstname, String lastname, String zip) {

		// Create Test Information
		test = report.createTest("Verify Order Product");

		// Steps Information
		test.log(Status.INFO, "Step1: Launching The Browser Successful");

		test.log(Status.INFO, "Step2: Navigating To Application via URL Successful");

		test.log(Status.PASS, "Step3: Verified the web page Successful ");

		test.log(Status.SKIP, "Step5: Element is Hidden");

		// Step 1: Object Creation for POM Classes
		HomePage hp = new HomePage(driver);
		CartPage cp = new CartPage(driver);
		CheckoutPage checkoutpage = new CheckoutPage(driver);
		CheckoutOverviewPage cop = new CheckoutOverviewPage(driver);
		ProductPage1 pp1 = new ProductPage1(driver);
		ProductPage2 pp2 = new ProductPage2(driver);
		ProductPage3 pp3 = new ProductPage3(driver);

		// Step 2: Click on "Sauce Labs Fleece Jacket" in Product List Page (PLP)
		Assert.assertTrue(hp.getfourthproduct().isDisplayed());
		
		if (hp.getfourthproduct().isDisplayed()) {
			test.log(Status.PASS, "Verified the Sauce Labs Fleece Jacket product is Displayed");

		} else {
			test.log(Status.FAIL, "Verified the Sauce Labs Fleece Jacket product is not Displayed");

		}
		WebDriverLibrary.elementClick(hp.getfourthproduct());

		// Step 3: Verify if "Sauce Labs Fleece Jacket" Product Details Page (PDP) is
		// displayed
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory-item.html?id=5");
		
		test.log(Status.PASS, "Verified the PDP page Successful ");


		// Step 4: Click on "Add To Cart" Button
		Assert.assertTrue(pp1.getaddtocartbtn().isEnabled());
		
		if (pp1.getaddtocartbtn().isEnabled()) {
			test.log(Status.PASS, "Verified the Add To Cart button is Displayed");

		} else {
			test.log(Status.FAIL, "Verified the Add To Cart button is not Displayed");

		}
		WebDriverLibrary.elementClick(pp1.getaddtocartbtn());

		// Step 5: Verify if count is incremented on Cart Icon (1)
		Assert.assertTrue(hp.getCarticon1().isDisplayed());
		
		if (hp.getCarticon1().isDisplayed()) {
			test.log(Status.PASS, "Verified the Count is Incremented");

		} else {
			test.log(Status.FAIL, "Verified the Count is not Incremented");

		}

		// Log
		System.out.println("Sauce Labs Fleece Jacket - Added to cart");

		// Step 6: Click on "Back to products" button
		Assert.assertTrue(pp1.getbacktoproducts().isEnabled());
		if (pp1.getbacktoproducts().isEnabled()) {
			test.log(Status.PASS, "Verified the Back to products button is Displayed");

		} else {
			test.log(Status.FAIL, "Verified the Back to products button is not Displayed");

		}
		WebDriverLibrary.elementClick(pp1.getbacktoproducts());

		// Step 7: Verify if Home page is displayed
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		
		test.log(Status.PASS, "Verified the Home page Successful ");


		// Step 8: Click on "Sauce Labs Bolt T-Shirt" in Product List Page (PLP)
		Assert.assertTrue(hp.getthirdproduct().isDisplayed());
		if (hp.getthirdproduct().isDisplayed()) {
			test.log(Status.PASS, "Verified the Sauce Labs Bolt T-Shirt product Displayed");

		} else {
			test.log(Status.FAIL, "Verified the Sauce Labs Bolt T-Shirt is not Displayed");

		}
		WebDriverLibrary.elementClick(hp.getthirdproduct());

		// Step 9: Verify if "Sauce Labs Bolt T-Shirt" Product Details Page (PDP) is displayed
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory-item.html?id=1");
		
		test.log(Status.PASS, "Verified the PDP page Successful ");


		// Step 10: Click on "Add To Cart" Button
		Assert.assertTrue(pp2.getaddtocartbtn1().isEnabled());
		if (pp2.getaddtocartbtn1().isEnabled()) {
			test.log(Status.PASS, "Verified the  Add To Cart button is Displayed");

		} else {
			test.log(Status.FAIL, "Verified the  Add To Cart button is not Displayed");

		}
		WebDriverLibrary.elementClick(pp2.getaddtocartbtn1());

		// Step 11: Verify if count is incremented on Cart Icon (2)
		Assert.assertTrue(hp.getCarticon2().isDisplayed());
		if (hp.getCarticon2().isDisplayed()) {
			test.log(Status.PASS, "Verified the Count is Incremented");

		} else {
			test.log(Status.FAIL, "Verified the Count is not Incremented");

		}

		// Log
		System.out.println("Sauce Labs Bolt T-Shirt - Added to cart");

		// Step 12: Click on "Back to products" button
		Assert.assertTrue(pp2.getbacktoproducts1().isEnabled());
		if (pp2.getbacktoproducts1().isEnabled()) {
			test.log(Status.PASS, "Verified the Back to products button is Displayed");

		} else {
			test.log(Status.FAIL, "Verified the Back to products button is not Displayed");

		}
		WebDriverLibrary.elementClick(pp2.getbacktoproducts1());

		// Step 13: Verify if Home page is displayed
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		
		test.log(Status.PASS, "Verified the Home page Successful ");


		// Step 14: Click on "Sauce Labs Bike Light" in Product List Page (PLP)
		Assert.assertTrue(hp.getsecondproduct().isDisplayed());
		if (hp.getsecondproduct().isDisplayed()) {
			test.log(Status.PASS, "Verified the Sauce Labs Bike Light product is Displayed");

		} else {
			test.log(Status.FAIL, "Verified the Sauce Labs Bike Light is not Displayed");

		}
		WebDriverLibrary.elementClick(hp.getsecondproduct());

		// Step 15: Verify if "Sauce Labs Bike Light" Product Details Page (PDP) is displayed
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory-item.html?id=0");
		
		test.log(Status.PASS, "Verified the PDP page Successful ");


		// Step 16: Click on "Add To Cart" Button
		Assert.assertTrue(pp3.getaddtocartbtn2().isEnabled());
		if (pp3.getaddtocartbtn2().isEnabled()) {
			test.log(Status.PASS, "Verified the  Add To Cart button is Displayed");

		} else {
			test.log(Status.FAIL, "Verified the  Add To Cart button is not Displayed");

		}
		WebDriverLibrary.elementClick(pp3.getaddtocartbtn2());

		// Log
		System.out.println("Sauce Labs Bike Light - Added to cart");

		// Step 17: Verify if count is incremented on Cart Icon (3)
		
		Assert.assertTrue(hp.getCarticon3().isDisplayed());
		
		if (hp.getCarticon3().isDisplayed()) {
			test.log(Status.PASS, "Verified the Count is Incremented");

		} else {
			test.log(Status.FAIL, "Verified the Count is not Incremented");

		}

		// Step 18: Click on "Cart" Icon
		Assert.assertTrue(hp.getcarticon().isEnabled());
		if (hp.getcarticon().isEnabled()) {
			test.log(Status.PASS, "Verified the Cart Icon is Enabled");

		} else {
			test.log(Status.FAIL, "Verified the Cart Icon is not Enabled");

		}
		WebDriverLibrary.elementClick(hp.getcarticon());

		// Step 19: Verify if Cart Page is displayed
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html");
		
		test.log(Status.PASS, "Verified the cart page Successful ");


		// Step 20: Verify the added products are listed with correct name, price, and
		// quantity
		String[] expectedNames = { "Sauce Labs Fleece Jacket", "Sauce Labs Bolt T-Shirt", "Sauce Labs Bike Light" };
		String[] expectedPrices = { "$49.99", "$15.99", "$9.99" };
		for (int i = 0; i < expectedNames.length; i++) {
			String actualName = cp.getItemNames().get(i).getText();
			String actualPrice = cp.getItemPrices().get(i).getText();
			String actualQty = cp.getItemQuantities().get(i).getText();

			Assert.assertEquals(actualName, expectedNames[i]);
			Assert.assertEquals(actualPrice, expectedPrices[i]);
			Assert.assertEquals(actualQty, "1");
		}
		System.out.println("All 3 products are valid in cart");

		// Step 21: Click on "Checkout" button

		Assert.assertTrue(cp.getcheckoutbtn().isEnabled());
		if (cp.getcheckoutbtn().isEnabled()) {
			test.log(Status.PASS, "Verified the Checkout Button is Enabled");

		} else {
			test.log(Status.FAIL, "Verified the Checkout Button is not Enabled");

		}
		WebDriverLibrary.elementClick(cp.getcheckoutbtn());

		// Step 22: Verify if "Checkout: Your Information" Page is displayed
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html");
		
		test.log(Status.PASS, "Verified the Checkout: Your Information page Successful ");


		// Step 23: Enter first name in "First Name" textfield
		Assert.assertTrue(checkoutpage.getfirstname().isDisplayed());
		if (checkoutpage.getfirstname().isDisplayed()) {
			test.log(Status.PASS, "Verified the First Name textfield is Displayed");

		} else {
			test.log(Status.FAIL, "Verified the First Name textfield is not Displayed");

		}
		WebDriverLibrary.enterTheData(checkoutpage.getfirstname(), firstname);

		// Step 24: Enter Last name in "Last Name" textfield
		Assert.assertTrue(checkoutpage.getlastname().isDisplayed());
		if (checkoutpage.getlastname().isDisplayed()) {
			test.log(Status.PASS, "Verified the Last Name textfield is Displayed");

		} else {
			test.log(Status.FAIL, "Verified the Last Name textfield is not Displayed");

		}
		WebDriverLibrary.enterTheData(checkoutpage.getlastname(), lastname);

		// Step 25: Enter Postal code in "Zip/Postal Code" textfield
		Assert.assertTrue(checkoutpage.getzipcode().isDisplayed());
		if (checkoutpage.getzipcode().isDisplayed()) {
			test.log(Status.PASS, "Verified the ZipCode textfield is Displayed");

		} else {
			test.log(Status.FAIL, "Verified the ZipCode textfield is not Displayed");

		}
		WebDriverLibrary.enterTheData(checkoutpage.getzipcode(), zip);

		// Step 26: Click on "Continue" Button
		Assert.assertTrue(checkoutpage.getcontinuebtn().isEnabled());
		if (checkoutpage.getcontinuebtn().isEnabled()) {
			test.log(Status.PASS, "Verified the Continue button is enabled");

		} else {
			test.log(Status.FAIL, "Verified the Continue button is not enabled");

		}
		WebDriverLibrary.elementClick(checkoutpage.getcontinuebtn());

		// Step 27: Verify if "Checkout: Overview" page is displayed
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-two.html");
		
		test.log(Status.PASS, "Verified the Checkout: Overview page Successful ");


		// Step 28: Verify the added products are listed with correct name, price, and
		// quantity
		String[] expectedNamesCOP = { "Sauce Labs Fleece Jacket", "Sauce Labs Bolt T-Shirt", "Sauce Labs Bike Light" };
		String[] expectedPricesCOP = { "$49.99", "$15.99", "$9.99" };
		for (int i = 0; i < expectedNames.length; i++) {
			String actualName = cop.getItemNames().get(i).getText();
			String actualPrice = cop.getItemPrices().get(i).getText();
			String actualQty = cop.getItemQuantities().get(i).getText();

			Assert.assertEquals(actualName, expectedNamesCOP[i]);
			Assert.assertEquals(actualPrice, expectedPricesCOP[i]);
			Assert.assertEquals(actualQty, "1");
		}
		System.out.println("All 3 products are valid in Checkout-Overview page");

		// Step 29: Click on "Finish" button
		Assert.assertTrue(cop.getfinishbtn().isEnabled());
		if (cop.getfinishbtn().isEnabled()) {
			test.log(Status.PASS, "Verified the Finish Button is Enabled");

		} else {
			test.log(Status.FAIL, "Verified the Finish Button is not Enabled");

		}
		WebDriverLibrary.elementClick(cop.getfinishbtn());

		// Step 30: Verify if "Checkout: Complete" Page is displayed with order confirmation
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-complete.html");
		
		test.log(Status.PASS, "Verified the Checkout: Complete page Successful ");


		// Log
		System.out.println("Products ordered succesfully");

	}
}

/*
 * package producttest;
 * 
 * import java.io.IOException;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import org.testng.Assert; import
 * org.testng.annotations.Test;
 * 
 * import genericlibrary.BaseConfig; import genericlibrary.ExcelLibrary;
 * 
 * public class Example1Test extends BaseConfig {
 * 
 * @Test public void Verify_If_User_Is_Able_To_Order_3_Products() {
 * 
 * // Step 8: Add "Sauce Labs Bolt T-Shirt" to cart addProductToCart(driver,
 * "Sauce Labs Bolt T-Shirt",
 * "https://www.saucedemo.com/inventory-item.html?id=1", "1");
 * 
 * // Step 9: Add "Sauce Labs Bike Light" to cart addProductToCart(driver,
 * "Sauce Labs Bike Light",
 * "https://www.saucedemo.com/inventory-item.html?id=0", "2");
 * 
 * // Step 10: Add "Sauce Labs Backpack" to cart addProductToCart(driver,
 * "Sauce Labs Backpack", "https://www.saucedemo.com/inventory-item.html?id=4",
 * "3");
 * 
 * // Step 11: Click on "Cart" Icon WebElement carticon =
 * driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
 * carticon.click();
 * 
 * // Step 12: Verify if Cart Page is displayed
 * Assert.assertEquals(driver.getCurrentUrl(),
 * "https://www.saucedemo.com/cart.html");
 * 
 * // Step 13: Verify the added products are listed with correct name
 * Assert.assertTrue(driver.findElement(By.
 * xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).isDisplayed());
 * Assert.assertTrue(driver.findElement(By.
 * xpath("//div[text()='Sauce Labs Bike Light']")).isDisplayed());
 * Assert.assertTrue(driver.findElement(By.
 * xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed());
 * 
 * // Step 14: Click on "Checkout" button WebElement checkout =
 * driver.findElement(By.id("checkout")); checkout.click();
 * 
 * // Step 15: Verify if "Checkout: Your Information" Page is displayed
 * Assert.assertEquals(driver.getCurrentUrl(),
 * "https://www.saucedemo.com/checkout-step-one.html");
 * 
 * // Step 16: Enter first name in "First Name" textfield WebElement firstname =
 * driver.findElement(By.id("first-name")); try { fname
 * =ExcelLibrary.readData("CO_Details", 1, 0); } catch (IOException e) {
 * e.printStackTrace(); } firstname.sendKeys(fname);
 * 
 * // Step 17: Enter Last name in "Last Name" textfield WebElement lastname =
 * driver.findElement(By.id("last-name")); try { lname =
 * ExcelLibrary.readData("CO_Details", 1, 1); } catch (IOException e) {
 * e.printStackTrace(); } lastname.sendKeys(lname);
 * 
 * // Step 18: Enter Postal code in "Zip/Postal Code" textfield WebElement
 * postalcode = driver.findElement(By.id("postal-code")); try { pin =
 * ExcelLibrary.readData("CO_Details", 1, 2); } catch (IOException e) {
 * e.printStackTrace(); } postalcode.sendKeys(pin);
 * 
 * // Step 19: Click on "Continue" Button WebElement cntinue =
 * driver.findElement(By.id("continue")); cntinue.click();
 * 
 * // Step 20: Verify if "Checkout: Overview" page is displayed
 * Assert.assertEquals(driver.getCurrentUrl(),
 * "https://www.saucedemo.com/checkout-step-two.html");
 * 
 * // Step 21: Verify the added products are listed in checkout overview
 * Assert.assertTrue(driver.findElement(By.
 * xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).isDisplayed());
 * Assert.assertTrue(driver.findElement(By.
 * xpath("//div[text()='Sauce Labs Bike Light']")).isDisplayed());
 * Assert.assertTrue(driver.findElement(By.
 * xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed());
 * 
 * // Step 22: Click on "Finish" button WebElement finish =
 * driver.findElement(By.id("finish")); finish.click();
 * 
 * // Step 23: Verify if "Checkout: Complete" Page is displayed with order //
 * confirmation Assert.assertEquals(driver.getCurrentUrl(),
 * "https://www.saucedemo.com/checkout-complete.html");
 * Assert.assertTrue(driver.findElement(By.
 * xpath("//h2[text()='Thank you for your order!']")).isDisplayed());
 * 
 * // Step 24: Click on "Back to home" button WebElement back2home =
 * driver.findElement(By.id("back-to-products")); back2home.click();
 * 
 * }
 * 
 * // method to add product to cart private void addProductToCart(WebDriver
 * driver, String productName, String expectedUrl, String expectedCartCount) {
 * // Step 1: Click on product WebElement product =
 * driver.findElement(By.xpath("//div[text()='" + productName + "']"));
 * product.click();
 * 
 * // Step 2: Verify product details page is displayed
 * Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
 * 
 * // Step 3: Click on "Add To Cart" Button WebElement addToCartBtn =
 * driver.findElement(By.xpath("//button[text()='Add to cart']"));
 * addToCartBtn.click();
 * 
 * // Step 4: Verify if cart count is incremented WebElement cartIcon =
 * driver.findElement(By.xpath("//span[text()='" + expectedCartCount + "']"));
 * Assert.assertTrue(cartIcon.isDisplayed());
 * 
 * // Step 5: Click on "Back to products" button WebElement backToProducts =
 * driver.findElement(By.id("back-to-products")); backToProducts.click();
 * 
 * // Step 6: Verify if Home page is displayed
 * Assert.assertEquals(driver.getCurrentUrl(),
 * "https://www.saucedemo.com/inventory.html"); } }
 */
