package NewtoursTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursLoginTest {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		
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
			System.out.println("Verification Failed. flightPageUrl not containes currentPage" );
		}

		String actualTitle = driver.getTitle();
		String expectedTitle = "Find a Flight: Mercury Tours:";

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Verification Passed! Title Find a Flight: Mercury Tours");
		} else {
			System.out.println("Verification Failed. Title not Find a Flight: Mercury Tours");
		}
	}
	}
