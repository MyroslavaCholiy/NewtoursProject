package com.codistan.webelementvsstring;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursWebElement {

	public static void main(String[] args) { //the 1st step
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.findElement(By.linkText("REGISTER")).click();
//		driver.findElement(By.partialLinkText("REGIS")).click();
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		
		
		WebElement firstNameTab = driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement lastNameTab = driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement phoneTab = driver.findElement(By.xpath("//input[@name='phone']"));
		WebElement emailTab = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement addressTab = driver.findElement(By.xpath("//input[@name = 'address1']"));
		WebElement cityTab = driver.findElement(By.xpath("//input[@name = 'city']"));
		WebElement stateTab = driver.findElement(By.xpath("//input[@name = 'state']"));
		WebElement postalCodeTab = driver.findElement(By.xpath("//input[@name = 'postalCode']"));
		WebElement userNameTab = driver.findElement(By.xpath("//input[@name = 'email']"));
		WebElement passwordTab = driver.findElement(By.xpath("//input[@name = 'password']"));
		WebElement confirmPasswordTab = driver.findElement(By.xpath("//input[@name = 'confirmPassword']"));
		WebElement submit = driver.findElement(By.xpath("//input[@name = 'register']"));
		
		String firstName = "Myroslava";
		String lastName = "Choliy";
		String phone = "8478009039";
		String email = "choliymira@gmail.com";
		String addressOne = "10 Oak Creec Dr. Apt.2012";
		String city = "Buffalo Grove";
		String state = "Illinois";
		String postalCode = "60089";
		String userName = "Mira";
		String password = "05221421";
		String confirmPassWord = "05221421";
		
		
		firstNameTab.sendKeys(firstName);
		//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ty"); (hardcoded)
		lastNameTab.sendKeys(lastName);
		phoneTab.sendKeys(phone);
		emailTab.sendKeys(email);
		addressTab.sendKeys(addressOne);
		cityTab.sendKeys(city);
		stateTab.sendKeys(state);
		postalCodeTab.sendKeys(postalCode);
		userNameTab.sendKeys(userName);
		passwordTab.sendKeys(password);
		confirmPasswordTab.sendKeys(confirmPassWord);
		submit.submit();
		
	}

}
