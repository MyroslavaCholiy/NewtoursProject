package NewtoursTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewtoursTestCases {

	NewtoursActions newtoursActions = new NewtoursActions();

	@BeforeTest

	public void startTest() {
		NewtoursSetUp.setUpDriver();
	}

//	1. Login
	@Test(priority = 2, description = "loginTest")

	public void loginTest() {
		newtoursActions.sendKeysUserName();
	}

	public void passwordTest() {
		newtoursActions.sendKeysPassword();
	}

	public void signInTest() {
		newtoursActions.signIn();
	}

//	 2. Find A Trip

	@Test(priority = 1, description = "findTrip")

	public void radioTest() {
		newtoursActions.radio();
	}

	public void passengersTest() {
		newtoursActions.selectPassengers();
	}

	public void selectDepartingFromTest() {
		newtoursActions.selectDepartingFrom();
	}

	public void selectOnTest() {
		newtoursActions.selectOn();
	}

	public void onLocator11Test() {
		newtoursActions.selectOn11();
	}

	public void arrivingInTest() {
		newtoursActions.selectArrivingIn();
	}

	public void returningTest() {
		newtoursActions.selectReturning();
	}

	public void radioBtn1test() {
		newtoursActions.selectRadio();
	}

	public void airlineTest() {
		newtoursActions.airline();
	}

	public void continueTest() {
		newtoursActions.selectContinue();
	}

	@Test(priority = 1, description = "book trip")

	public void radioTest() {
		newtoursActions.selectRadio();
	}

	public void radioTest() {
		newtoursActions.selectRadio();
	}

	public void continueTest() {
		newtoursActions.selectContinue();
	}

	public void firstNameTest() {
		newtoursActions.selectFirstNameTab();
	}

	public void lastNameTabTest() {
		newtoursActions.selectlastNameTab();
	}

	public void mealTest() {
		newtoursActions.mealLocator();
	}

	public void cardTypeTest() {
		newtoursActions.cardTypeLocator();
	}

	public void numberCardTabTest() {
		newtoursActions.numberCardTab();
	}

	public void expirationLocatorTest() {
		newtoursActions.expirationLocator();
	}

	public void expirationLocator1Test() {
		newtoursActions.expirationLocator1();
	}

	public void addressTabTest() {
		newtoursActions.addressTab();
	}

	public void cityTabTest() {
		newtoursActions.cityTab();
	}

	public void stateTabTest() {
		newtoursActions.cityTab();
	}

	public void postalTabTest() {
		newtoursActions.postalTab();
	}

	public void countryLocatorTest() {
		newtoursActions.countryLocator();
	}

	public void securePurchaseBtn() {
		newtoursActions.securePurchaseBtn();
	}

}
