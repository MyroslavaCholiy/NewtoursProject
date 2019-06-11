package NewtoursTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewtoursActions {

	NewtoursLocators newtoursLocators = new NewtoursLocators();
	// 1 Login
	public void sendKeysUserNameTab() {
		newtoursLocators.userNameTab(NewtoursSetUp.getDriver()).sendKeys("tutorial");
	}

	public void sendKeysPasswordTab() {
		newtoursLocators.passwordTab(NewtoursSetUp.getDriver()).sendKeys("tutorial");
	}
	// 2. Find A Trip
	public void radioButon() {
		newtoursLocators.radioButon(NewtoursSetUp.getDriver()).click();
	}

	
	public void selectPassengersLokator() {
		Select passengers = new Select(newtoursLocators.passengersLokator(NewtoursSetUp.getDriver()));
		passengers.selectByValue("value");
	}

	public void selectDepartingFromLocator() {
		Select departingFrom = new Select(newtoursLocators.departingFromLocator(NewtoursSetUp.getDriver()));
		departingFrom.selectByValue("Paris");
	}

	// OnLocator - Month
	public void selectOnLocator() {
		Select on = new Select(newtoursLocators.onLocator(NewtoursSetUp.getDriver()));
		on.selectByValue("12");
	}

	// OnLocator1 - onday
	public void selectOnLocator11() {
		Select on11 = new Select(newtoursLocators.onLocator11(NewtoursSetUp.getDriver()));
		on11.selectByValue("24");
	}

	// ArrivingInLocator
	public void selectArrivingInLocator() {
		Select arrivingIn = new Select(newtoursLocators.arrivingInLocator(NewtoursSetUp.getDriver()));
		arrivingIn.selectByValue("Seattle");
	}

	// ReturningLocator
	public void selectReturning() {
		Select returning = new Select(newtoursLocators.returningLocator(NewtoursSetUp.getDriver()));
		returning.selectByValue("12");
	}

	// radioBtn1 Business
	public void selectRadioBtn1() {
		newtoursLocators.radioBtn1(NewtoursSetUp.getDriver()).click();
	}
	
	{
//		?????? 
	}

	public void airlineLocator() {
		Select airline = new Select(newtoursLocators.airlineLocator(NewtoursSetUp.getDriver()));
		airline.selectByVisibleText("Unified Airlines");
	}

	public void selectContinueButon() {
		newtoursLocators.continueButon(NewtoursSetUp.getDriver()).click();

	}

	public void selectRadio() {
		newtoursLocators.radio(NewtoursSetUp.getDriver()).click();

	}

	public void selectRadio1() {
		newtoursLocators.radio1(NewtoursSetUp.getDriver()).click();

	}

	public void selectContinueBtn() {
		newtoursLocators.continueBtn(NewtoursSetUp.getDriver()).click();

	}

	public void selectFirstNameTab() {
		newtoursLocators.firstNameTab(NewtoursSetUp.getDriver()).sendKeys("John");
	}

	public void selectlastNameTab() {
		newtoursLocators.lastNameTab(NewtoursSetUp.getDriver()).sendKeys("Smithn");
	}

	public void mealLocator() {
		Select mealLocator = new Select(newtoursLocators.mealLocator(NewtoursSetUp.getDriver()));
		mealLocator.selectByValue("VGML");
	}

	public void cardTypeLocator() {
		Select cardTypeLocator = new Select(newtoursLocators.cardTypeLocator(NewtoursSetUp.getDriver()));
		cardTypeLocator.selectByValue("BA");
	}

	public void numberCardTab() {
		newtoursLocators.numberCardTab(NewtoursSetUp.getDriver()).sendKeys("4111111111111111");
		// String numberCard = "4111111111111111";
	//	numberCardTab.sendKeys("4111111111111111");
	}

	public void expirationLocator() {
		Select expirationLocator = new Select(newtoursLocators.expirationLocator(NewtoursSetUp.getDriver()));
		expirationLocator.selectByVisibleText("12");
	}
	

	public void expirationLocator1() {
		Select expirationLocator1 = new Select(newtoursLocators.expirationLocator1(NewtoursSetUp.getDriver()));
		expirationLocator1.selectByValue("2010");
	}

	public void addressTab() {
		newtoursLocators.addressTab(NewtoursSetUp.getDriver()).sendKeys("7921 Jonas Branch dr");
	}

	public void cityTab() {
		newtoursLocators.cityTab(NewtoursSetUp.getDriver()).sendKeys("McLean");
//		cityTab.clear();
//		String city = "McLean";
//		cityTab.sendKeys(city);
	}

	public void stateTab() {
		newtoursLocators.stateTab(NewtoursSetUp.getDriver()).sendKeys("VA");
	}

	public void postalTab() {
		newtoursLocators.postalTab(NewtoursSetUp.getDriver()).sendKeys("22102");
//		postalTab.clear();
//		String postal = "22102";
//		postalTab.sendKeys(postal);
	}

	public void countryLocator() {
		newtoursLocators.countryLocator(NewtoursSetUp.getDriver()).sendKeys("215");
//		countryLocator.selectByValue("215");
	}

	public void securePurchaseBtn() {
		newtoursLocators.securePurchaseBtn(NewtoursSetUp.getDriver()).click();
//	securePurchaseBtn.click();
	}

}
