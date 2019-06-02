package comNewtours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NnewtoursDemoautCom {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
						
		WebElement firstNameTab = driver.findElement(By.xpath("//*[@name='firstName']"));
		WebElement lastNameTab = driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement phoneTab = driver.findElement(By.xpath("//input[@name='phone']"));
		WebElement emailTab = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement address1Loc = driver.findElement(By.xpath("//input[@name='address1']"));
		WebElement address2 = driver.findElement(By.xpath("//input[@name='address2']"));
		
		
			   
		
		
		String firstName = "Oleksandr";
		String lastName1 = "Holyk";
		String phone1 = "2245775260";
		String email1 = "fww@yahoo.com";
		String address1 = "Address1";
	//	String address2 = "Address2";
		
		
	 
		firstNameTab.sendKeys(firstName);
		//lastNameTab.sendKeys(lastName);
		
		//phoneTab.sendKeys(phone);
		//emailTab.sendKeys(email);
		//address1.sendKeys(Address1);
		//address2.sendKeys(Address2);
		
	   
	}

}
