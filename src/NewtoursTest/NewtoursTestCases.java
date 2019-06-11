package NewtoursTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import org.testng.annotations.Test;

public class NewtoursTestCases {

	NewtoursActions newtoursActions = new NewtoursActions();

	@BeforeTest

	public void startTest() {
		NewtoursSetUp.setUpDriver();

	}

//	1. Login
	@Test (priority = 1)

	public void loginTest() {
		newtoursActions.sendKeysUserNameTab();
		newtoursActions.sendKeysPasswordTab();

	}

//	// 2. Find A Trip
	@Test (priority = 2)
	public void findTripTest() {
		newtoursActions.radioButon();
		
		
		newtoursActions.selectPassengersLokator();
		newtoursActions.selectDepartingFromLocator();
		newtoursActions.selectOnLocator();
		newtoursActions.selectOnLocator11();
		newtoursActions.selectArrivingInLocator();
		newtoursActions.selectReturning();
		newtoursActions.selectRadioBtn1();
		newtoursActions.airlineLocator();
		newtoursActions.selectContinueButon();
		newtoursActions.selectRadio();
		newtoursActions.selectRadio1();
		newtoursActions.selectContinueBtn();
		newtoursActions.selectFirstNameTab();
		newtoursActions.selectlastNameTab();
		newtoursActions.mealLocator();
		newtoursActions.cardTypeLocator();
		newtoursActions.numberCardTab();
		newtoursActions.expirationLocator();
		newtoursActions.expirationLocator1();
		newtoursActions.addressTab();
		newtoursActions.cityTab();
		newtoursActions.stateTab();
		newtoursActions.postalTab();
		newtoursActions.countryLocator();
		newtoursActions.securePurchaseBtn();
	
		
	}

}
