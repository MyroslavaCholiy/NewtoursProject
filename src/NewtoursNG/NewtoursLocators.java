package NewtoursTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewtoursLocators {

	public static WebElement element;
		}
//	public static WebElement userName(WebDriver driver) {
//		element = driver.findElement(By.xpath("//input[@name='userName']"));
//		return element;
//
//		// TODO Auto-generated method stub
//	}
//
//	public static WebElement password(WebDriver driver) {
//
//		element = driver.findElement(By.xpath("//input[@name='password']"));
//		return element;
//
//	}
//	
//	public static WebElement signIn(WebDriver driver) {
//		return element = driver.findElement(By.xpath("//input[@name='login']"));
//	}

	public static WebElement radio(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@value='roundtrip']"));
		return element;
	}

	public static WebElement passengers(WebDriver driver) {

		element = driver.findElement(By.xpath("//select [@name='passCount']"));
		return element;
	}

	public static WebElement departingFrom(WebDriver driver) {
		element = driver.findElement(By.xpath("//select [@name='fromPort']"));
		return element;
	}

	public static WebElement onMonth(WebDriver driver) {
		element = driver.findElement(By.xpath("//select [@name='fromMonth']"));
		return element;
	}

	public static WebElement onDay(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@name='fromDay']"));
		return element;
	}

	public static WebElement arrivingIn(WebDriver driver) {

		element = driver.findElement(By.xpath("//select [@name='toPort']"));
		return element;
	}

	public static WebElement returning(WebDriver driver) {

		element = driver.findElement(By.xpath("//select [@name='toMonth']"));
		return element;
	}

	public static WebElement radio(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@value='Business']"));
		return element;
	}

	public static WebElement airline(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@name='airline']"));
		return element;
	}

	public static WebElement continue(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='findFlights']"));
		return element;
	}

// 3 - Select Trip
	public static WebElement radio(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']"));
		return element;
	}

	public static WebElement radio(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']"));
		return element;
	}

	public static WebElement continue(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='reserveFlights']"));
		return element;
	}

	// 4 Book A Flight

	public static WebElement firstName(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='passFirst0']"));
		return element;
	}

	public static WebElement lastName(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='passLast0']"));
		return element;
	}

	public static WebElement meal(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@name='pass.0.meal']"));
		return element;
	}

	public static WebElement cardType(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@name='creditCard']"));
		return element;
	}

	public static WebElement numberCard(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='creditnumber']"));
		return element;
	}

	public static WebElement expiration(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"));
		return element;
	}

	public static WebElement expiration(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"));
		return element;
	}

	public static WebElement address(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='billAddress1']"));
		return element;
	}

	public static WebElement city(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='billCity']"));
		return element;
	}

	public static WebElement state(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='billState']"));
		return element;
	}

	public static WebElement postal(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='billZip']"));
		return element;
	}

	public static WebElement country(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='billZip']"));
		return element;
	}

	public static WebElement securePurchase(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='buyFlights']"));
		return element;
	}

	

}
