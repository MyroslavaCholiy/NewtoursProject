package NewtoursTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewtoursTest {
static WebDriver driver = new ChromeDriver();

public static void main(String[] args) {

		String newtours = "http://newtours.demoaut.com";
		driver.get(newtours);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
		WebElement userNameTab = driver.findElement(By.xpath("//input[@name='userName']"));
		String userName = "tutorial";
		userNameTab.sendKeys(userName);

		WebElement passwordTab = driver.findElement(By.xpath("//input[@name='password']"));
		String password = "tutorial";
		passwordTab.sendKeys(password);

		driver.findElement(By.xpath("//input[@name='login']")).click();

		String flightPageUrl = "http://newtours.demoaut.com/mercuryreservation.php";
		String currentPage = driver.getCurrentUrl();

		if (flightPageUrl.contentEquals(currentPage)) {
			System.out.println("Verification Passed! flightPageUrl containes currentPage ");
		} else {
			System.out.println("Verification Failed. flightPageUrl not containes currentPage");
		}

		String actualTitle = driver.getTitle();
		String expectedTitle = "Find a Flight: Mercury Tours:";

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Verification Passed! Title Find a Flight: Mercury Tours");
		} else {
			System.out.println("Verification Failed. Title not Find a Flight: Mercury Tours");
		}

// 2.  Find A Trip

// Verify Round trip //verify One way

		WebElement radioButon = driver.findElement(By.xpath("//input[@value='roundtrip']"));
		String actualRoundTrip = "radioButon";
		String expectedRondTrip = "//input[@value='roundtrip']";
		String OneWayTrip = "//input[@value='oneway']";

// RoundTrip or One Way trip
		if (actualRoundTrip.isEmpty()) {
			System.out.println("Verifacation Failed. Unchecked. OneWay is choosen");
		} else {
			System.out.println("Verification Passed! Checked actualRoundTrip");
		}

// PassengersLokator

		WebElement passengersLokator = driver.findElement(By.xpath("//select [@name='passCount']"));
		Select passengers = new Select(passengersLokator);
		passengers.selectByValue("2");
		String passengers2 = passengersLokator.getAttribute("value");

		if (passengers2.equals("2")) {
			System.out.println("Verification Passed! Passengers was selected 2. ");
		} else {
			System.out.println("Verification Failed. Passengers Verification.");
		}

//DepartingFromLocator
		WebElement departingFromLocator = driver.findElement(By.xpath("//select [@name='fromPort']"));
		Select departingFrom = new Select(departingFromLocator);
		departingFrom.selectByValue("Paris");

		if (departingFrom.getFirstSelectedOption().getText().equals("Paris")) {
			System.out.println("Verification Passed! DepartingFrom Paris.");
		} else {
			System.out.println("Verification Failed. DepartingFrom Paris is non selected.");
		}

// OnLocator - Month
		WebElement onLocator = driver.findElement(By.xpath("//select [@name='fromMonth']"));
		Select on = new Select(onLocator);
		on.selectByValue("12");
		// String onLocator1 = onLocator.getAttribute("12");

		if (on.getFirstSelectedOption().getText().equals("December")) {
			System.out.println("Verification Passed! SelectedOn Month December. ");
		} else {
			System.out.println("Verifacation Failed. SelectedOn Month December. ");
		}

//OnLocator1 - onday
		WebElement onLocator11 = driver.findElement(By.xpath("//select[@name='fromDay']"));
		Select on1 = new Select(onLocator11);
		on1.selectByValue("24");
		// String onDay = onLocator11.getAttribute("24");

		if (on1.getFirstSelectedOption().getText().equals("24")) {
			System.out.println("Verification Passed! SelectedOn1 Day 24. ");
		} else {
			System.out.println("Verifacation Failed. no SelectedOn1 Day 24. ");
		}

//ArrivingInLocator
		WebElement arrivingInLocator = driver.findElement(By.xpath("//select [@name='toPort']"));
		Select arrivingIn = new Select(arrivingInLocator);
		arrivingIn.selectByValue("Seattle");

		if (arrivingIn.getFirstSelectedOption().getText().equals("Seattle")) {
			System.out.println("Verification Passed! Arriving Seattle. ");
		} else {
			System.out.println("Verifacation Failed. Arriving Seattle. ");
		}

//ReturningLocator
		WebElement returningLocator = driver.findElement(By.xpath("//select [@name='toMonth']"));
		Select returning = new Select(returningLocator);
		returning.selectByValue("12");
		// String returningLocator1 = returningLocator.getAttribute("12");

		if (returningLocator.getText().equals("12")) {
			System.out.println("Verification Passed! Returning Month December. ");
		} else {
			System.out.println("Verification Failed. Returning Month December. ");
		}

// radioBtn1 Business
		WebElement radioBtn1 = driver.findElement(By.xpath("//input[@value='Business']"));
		radioBtn1.click();

		// AirlineLocator
		WebElement airlineLocator = driver.findElement(By.xpath("//select[@name='airline']"));
		driver.findElement(By.xpath("//input[@name='findFlights']"));
		Select airline = new Select(airlineLocator);
		airline.selectByVisibleText("Unified Airlines");

		if (airline.getFirstSelectedOption().getText().equals("Unified Airlines")) {
			System.out.println("Verification Passed! Airline - Unified Airlines.");
		} else {
			System.out.println("Verification failed. Airline - Unified Airlines. ");
		}

//ContinueButon
		WebElement continueButon = driver.findElement(By.xpath("//input[@name='findFlights']"));
		continueButon.click();

//flightPageUrl1 containers currentPage	

		String currentPage1 = "http://newtours.demoaut.com/";
		String flightPageUrl1 = driver.getCurrentUrl();

		if (flightPageUrl1.contains(currentPage1)) {
			System.out.println("Verification Passed! currentPage1  flightPageUrl1. ");
		} else {
			System.out.println("Verification Failed. currentPage1  flightPageUrl1. ");
		}

//String	actualTitle1 = Select a Flight: Mercury Tours\r\
		String actualTitle11 = driver.getTitle();
		String expectedTitle11 = "Select a Flight: Mercury Tours";

		if (expectedTitle11.equals(actualTitle)) {
			System.out.println("Verification Passed! Title11 is Flight: Mercury Tours");

		} else {
			System.out.println("Verification Failed. Title11 is Flight: Mercury Tours");
		}

// 3 - Select Trip
		WebElement radio = driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']"));
		radio.click();

		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']"));
		radio1.click();

		WebElement continueBtn = driver.findElement(By.xpath("//input[@name='reserveFlights']"));
		continueBtn.click();
// URL expectedUrl
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://newtours.demoaut.com/mercurypurchase.php";

		if (actualUrl.equals(expectedUrl)) {
			System.out.println("Verification Passed! currentPage1  flightPageUrl1.");
		} else {
			System.out.println("Verification Failed. currentPage1  flightPageUrl1.");
		}
// Title 
		String actualTitle1 = driver.getTitle();
		String expectedTitle1 = "Book a Flight: Mercury Tours";

		if (actualTitle1.equals(expectedTitle1)) {
			System.out.println("Verification Passed! Book a Flight: Mercury Tours");
		} else {
			System.out.println("Verification Failed. currentTitle");
		}

// 4 Book A Flight

		WebElement firstNameTab = driver.findElement(By.xpath("//input[@name='passFirst0']"));
		String firstName = "John";
		firstNameTab.sendKeys(firstName);

		WebElement lasttNameTab = driver.findElement(By.xpath("//input[@name='passLast0']"));
		String lasttName = "Smith";
		lasttNameTab.sendKeys(lasttName);

		if (firstName.contains("John")) {
			System.out.println("Verification Passed! firstName = John ");
		} else {
			System.out.println("Verification Failed. firstName = John ");
		}

		if (lasttName.contains("Smith")) {
			System.out.println("Verification Passed! lasttName = Smith ");
		} else {
			System.out.println("Verification Failed. lasttName = Smith ");
		}

		WebElement mealLocator = driver.findElement(By.xpath("//select[@name='pass.0.meal']"));
		Select meal = new Select(mealLocator);
		meal.selectByValue("VGML");

		if (meal.getFirstSelectedOption().getText().equals("Vegetarian")) {
			System.out.println("Verification Passed! meal = Vegetarian");
		} else {
			System.out.println("Verification Failed. meal = Vegetarian");
		}
		
		
		WebElement cardTypeLocator = driver.findElement(By.xpath("//select[@name='creditCard']"));
		Select cardType = new Select(cardTypeLocator);
		cardType.selectByValue("BA");
		
		if(cardType.getFirstSelectedOption().getText().equals("Visa")) {
			System.out.println("Verification Passed! Card type = Visa");
		}else {
			System.out.println("Verification Failed. Card type = Visa");
		}
		
		
		WebElement numberCardTab = driver.findElement(By.xpath("//input[@name='creditnumber']"));
		String numberCard = "4111111111111111";
		numberCardTab.sendKeys(numberCard);
		
		if(numberCard.contains("4111111111111111")) {
			System.out.println("Verification Passed! Card number = 4111111111111111");
		}else {
			System.out.println("Verification Failed. Card number = 4111111111111111");
		}
				
		WebElement expirationLocator = driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"));
		Select expiration = new Select(expirationLocator);
		expiration.selectByVisibleText("12");;
		
		if(expiration.getFirstSelectedOption().getText().equals("12")) {
			System.out.println("Verification Passed! Card card expiration -12");
		}else {
			System.out.println("Verification Failed. Card card expiration -12");
		}
		
		WebElement expirationLocator1 = driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"));
		Select expiration1 = new Select(expirationLocator1);
		expiration1.selectByValue("2010");
		
		if(expiration1.getFirstSelectedOption().getText().equals("2010")) {
			System.out.println("Verification Passed! Card card expiration -2010");
		}else {
			System.out.println("Verification Failed. Card card expiration -2010");
		}
		
		
		WebElement addressTab = driver.findElement(By.xpath("//input[@name='billAddress1']"));
		String address = "7921 Jonas Branch dr";
		addressTab.sendKeys(address);
		
		if(address.contains("7921 Jonas Branch dr")) {
			System.out.println("Verification Passed! address = 7921 Jonas Branch dr");
		}else {
			System.out.println("Verification failed address = 7921 Jonas Branch dr");
		}
		
		WebElement cityTab = driver.findElement(By.xpath("//input[@name='billCity']"));
		String city = "McLean";
		cityTab.sendKeys(city);
		
		if(city.contains("McLean")) {
			System.out.println("Verification Passed! city McLean");
		}else {
			System.out.println("Verification Failed! city McLean");
		}
		
		WebElement stateTab = driver.findElement(By.xpath("//input[@name='billState']"));
		String state = "VA";
		stateTab.sendKeys(state);
		
		if(city.contains("VA")) {
			System.out.println("Verification Passed! State/Province - VA");
		}else {
			System.out.println("Verification Failed. State/Province - VA");
		}
		
		WebElement postalTab = driver.findElement(By.xpath("//input[@name='billZip']"));
		String postal = "22102";
		postalTab.sendKeys(postal);
		
		if(city.contains("22102")) {
			System.out.println("Verification Passed! postal code - 22102");
		}else {
			System.out.println("Verification Failed. postal code - 22102");
		}
		
		WebElement countryLocator = driver.findElement(By.xpath("//select[@name='billCountry']"));
		Select country = new Select(countryLocator);
		country.selectByValue("215");
		
		if(country.getFirstSelectedOption().getText().equals("UNITED STATES ")) {
			System.out.println("Verification Passed! country UNITED STATES ");
		}else {
			System.out.println("Verification Failed. country UNITED STATES ");
		}
		
		WebElement securePurchaseBtn = driver.findElement(By.xpath("//input[@name='buyFlights']"));
		securePurchaseBtn.click();
		
		
		
		String bookFlightUrl = "http://newtours.demoaut.com/mercurypurchase2.php";
		String currentUrl = driver.getCurrentUrl();
		
		if(bookFlightUrl.contains(currentUrl)) {
			System.out.println("Verification Passed! bookFlightUrl ");
		}else {
			System.out.println("Verification Failed! bookFlightUrl ");
		}
		
		String titleConf = "Flight Confirmation: Mercury Tours";
		String currentTitle = driver.getTitle();
		
		if(titleConf.contains(currentTitle)) {
			System.out.println("Verification Passed! Title ");
			}else {
				System.out.println("Verification Failed! Title ");
			}

	}



}



	
	


