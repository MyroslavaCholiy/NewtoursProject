package NewtoursTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewtoursActions {

	NewtoursLocators newtoursLocators = new NewtoursLocators();
	// 1 Login
//	public void sendKeysUserName() {
//		newtoursLocators.userName(NewtoursSetUp.getDriver()).sendKeys("tutorial");
//	}
//
//	public void sendKeysPasswordTab() {
//		newtoursLocators.password(NewtoursSetUp.getDriver()).sendKeys("tutorial");
//	}
//	
//	public void signIn() {
//		newtoursLocators.signIn(NewtoursSetUp.getDriver()).click();
//	}
	
	// 2. Find A Trip
	public void radio() {
		newtoursLocators.radio(NewtoursSetUp.getDriver()).click();
	}

	
	public void selectPassengers() {
		Select passengers = new Select(newtoursLocators.passengers(NewtoursSetUp.getDriver()));
		passengers.selectByValue("2");
	}

	public void selectDepartingFrom() {
		Select departingFrom = new Select(newtoursLocators.departingFrom(NewtoursSetUp.getDriver()));
		departingFrom.selectByValue("Paris");
	}

	// OnLocator - Month
	public void selectOn() {
		Select on = new Select(newtoursLocators.on(NewtoursSetUp.getDriver()));
		on.selectByValue("12");
	}

	// OnLocator1 - onday
	public void selectOn() {
		Select on = new Select(newtoursLocators.on(NewtoursSetUp.getDriver()));
		on.selectByValue("24");
	}

	// ArrivingInLocator
	public void selectArrivingIn() {
		Select arrivingIn = new Select(newtoursLocators.arrivingIn(NewtoursSetUp.getDriver()));
		arrivingIn.selectByValue("Seattle");
	}

	// ReturningLocator
	public void selectReturning() {
		Select returning = new Select(newtoursLocators.returning(NewtoursSetUp.getDriver()));
		returning.selectByValue("12");
	}

	// radioBtn1 Business
	public void selectRadio() {
		newtoursLocators.radio(NewtoursSetUp.getDriver()).click();
	}
	
		public void airline() {
		Select airline = new Select(newtoursLocators.airline(NewtoursSetUp.getDriver()));
		airline.selectByVisibleText("Unified Airlines");
	}

	public void selectContinue() {
		newtoursLocators.continue(NewtoursSetUp.getDriver()).click();

	}

	public void selectRadio() {
		newtoursLocators.radio(NewtoursSetUp.getDriver()).click();

	}

	public void selectRadio() {
		newtoursLocators.radio(NewtoursSetUp.getDriver()).click();

	}

	public void selectContinue() {
		newtoursLocators.continue(NewtoursSetUp.getDriver()).click();

	}

	public void selectFirstName() {
		newtoursLocators.firstName(NewtoursSetUp.getDriver()).sendKeys("John");
	}

	public void selectlastName() {
		newtoursLocators.lastName(NewtoursSetUp.getDriver()).sendKeys("Smithn");
	}

	public void meal() {
		Select meal = new Select(newtoursLocators.meal(NewtoursSetUp.getDriver()));
		meal.selectByValue("VGML");
	}

	public void cardType() {
		Select cardType = new Select(newtoursLocators.cardType(NewtoursSetUp.getDriver()));
		cardType.selectByValue("BA");
	}

	public void numberCard() {
		newtoursLocators.numberCard(NewtoursSetUp.getDriver()).sendKeys("4111111111111111");
		// String numberCard = "4111111111111111";
	//	numberCardTab.sendKeys("4111111111111111");
	}

	public void expiration() {
		Select expiration = new Select(newtoursLocators.expiration(NewtoursSetUp.getDriver()));
		expiration.selectByVisibleText("12");
	}
	

	public void expiration() {
		Select expiration = new Select(newtoursLocators.expiration(NewtoursSetUp.getDriver()));
		expiration.selectByValue("2010");
	}

	public void address() {
		newtoursLocators.addressT(NewtoursSetUp.getDriver()).sendKeys("7921 Jonas Branch dr");
	}

	public void city() {
		newtoursLocators.city(NewtoursSetUp.getDriver()).sendKeys("McLean");
//		cityTab.clear();
//		String city = "McLean";
//		cityTab.sendKeys(city);
	}

	public void state() {
		newtoursLocators.state(NewtoursSetUp.getDriver()).sendKeys("VA");
	}

	public void postal() {
		newtoursLocators.postal(NewtoursSetUp.getDriver()).sendKeys("22102");
//		postalTab.clear();
//		String postal = "22102";
//		postalTab.sendKeys(postal);
	}

	public void country() {
		newtoursLocators.country(NewtoursSetUp.getDriver()).sendKeys("215");
//		countryLocator.selectByValue("215");
	}

	public void securePurchase() {
		newtoursLocators.securePurchase(NewtoursSetUp.getDriver()).click();
//	securePurchaseBtn.click();
	}

}
