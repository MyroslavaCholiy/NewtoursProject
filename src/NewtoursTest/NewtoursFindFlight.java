package NewtoursTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewtoursFindFlight {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe ");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/index.php");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String newtours = "http://newtours.demoaut.com";
		driver.get(newtours);

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
			System.out.println("Verification Faied. flightPageUrl not containes currentPage");
		}

		String actualTitle = driver.getTitle();
		String expectedTitle = "Find a Flight: Mercury Tours:";

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Verification Passed! Title Find a Flight: Mercury Tours");
		} else {
			System.out.println("Verification Failed! Title is not Found a Flight: Mercury Tours");
		}

		// Find A Trip

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
						//String onLocator1 = onLocator.getAttribute("12");

						if (on.getFirstSelectedOption().getText().equals("December")) {
							System.out.println("Verification Passed! SelectedOn Month December. ");
						} else {
							System.out.println("Verifacation Failed. SelectedOn Month December. ");
						}
						
		//OnLocator1 - onday
						WebElement onLocator11 = driver.findElement(By.xpath("//select[@name='fromDay']"));
						Select on1= new Select(onLocator11 );
						on1.selectByValue("24");
						//	String onDay = onLocator11.getAttribute("24");

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
						//String returningLocator1 = returningLocator.getAttribute("12");

						if (returningLocator.getText().equals("12")){
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


}}