package NewtoursTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewtoursLocators {

	public static WebElement element;
	public WebDriver driver() {
		return null;
		
	}
	public static WebElement userNameTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='userName']"));
		return element;

		// TODO Auto-generated method stub
	}

	public static WebElement passwordTab(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='password']"));
		return element;

	}

	public static WebElement radioButon(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@value='roundtrip']"));
		return element;
	}

	public static WebElement passengersLokator(WebDriver driver) {

		element = driver.findElement(By.xpath("//select [@name='passCount']"));
		return element;
	}

	public static WebElement departingFromLocator(WebDriver driver) {

		element = driver.findElement(By.xpath("//select [@name='fromPort']"));
		return element;
	}

	public static WebElement onLocator(WebDriver driver) {

		element = driver.findElement(By.xpath("//select [@name='fromMonth']"));
		return element;
	}

	public static WebElement onLocator11(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@name='fromDay']"));
		return element;
	}

	public static WebElement arrivingInLocator(WebDriver driver) {

		element = driver.findElement(By.xpath("//select [@name='toPort']"));
		return element;
	}

	public static WebElement returningLocator(WebDriver driver) {

		element = driver.findElement(By.xpath("//select [@name='toMonth']"));
		return element;
	}

	public static WebElement radioBtn1(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@value='Business']"));
		return element;
	}

	public static WebElement airlineLocator(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@name='airline']"));
		return element;
	}

	public static WebElement continueButon(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='findFlights']"));
		return element;
	}

// 3 - Select Trip
	public static WebElement radio(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']"));
		return element;
	}

	public static WebElement radio1(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']"));
		return element;
	}

	public static WebElement continueBtn(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='reserveFlights']"));
		return element;
	}

	// 4 Book A Flight

	public static WebElement firstNameTab(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='passFirst0']"));
		return element;
	}

	public static WebElement lastNameTab(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='passLast0']"));
		return element;
	}

	public static WebElement mealLocator(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@name='pass.0.meal']"));
		return element;
	}

	public static WebElement cardTypeLocator(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@name='creditCard']"));
		return element;
	}

	public static WebElement numberCardTab(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='creditnumber']"));
		return element;
	}

	public static WebElement expirationLocator(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"));
		return element;
	}

	public static WebElement expirationLocator1(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"));
		return element;
	}

	public static WebElement addressTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='billAddress1']"));
		return element;
	}

	public static WebElement cityTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='billCity']"));
		return element;
	}

	public static WebElement stateTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='billState']"));
		return element;
	}

	public static WebElement postalTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='billZip']"));
		return element;
	}

	public static WebElement countryLocator(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='billZip']"));
		return element;
	}

	public static WebElement securePurchaseBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='buyFlights']"));
		return element;
	}

	

}
