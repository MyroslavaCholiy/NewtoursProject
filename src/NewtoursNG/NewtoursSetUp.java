package NewtoursTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursSetUp {

	public static NewtoursSetUp newtoursSetUp;
	private static WebDriver driver;
	public static WebDriver getDriver;

	private NewtoursSetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe")
		
		driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=2db06c1ca7edfd46ec4e2c275aff352c");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static WebDriver getDriver() {
//I am using static methods not to create object, it provides performance in memory.
		// You need to create static methods to read static variables.
		return driver;

	}

	public static void setUpDriver() {

		if (newtoursSetUp == null) {
			newtoursSetUp = new NewtoursSetUp();

		}

	}

	public static void tearDown() {
//	@AfterTest	
		if (driver != null) {

			driver.close();
			driver.quit();
		}

	}

}
