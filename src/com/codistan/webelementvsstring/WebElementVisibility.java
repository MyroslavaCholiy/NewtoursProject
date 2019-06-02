package com.codistan.webelementvsstring;

import java.io.Console;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementVisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");//means navigate to needed page
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		boolean googleTab = searchbox.isDisplayed();
		
		System.out.println(searchbox.isDisplayed());
		System.out.println(googleTab);
		
		
		
		
		/*
		 * 
		 * If GoogleTab is displayed
		 * do System.out.println("coistan
		 * else
		 * do
		 * Sysytem.out.println("Amazon")
		 */
		
		
		/*
		 * Open Browser
		 * Go to google.com
		 * Verify if search tab is Despliaed
		 * 
		 */
		

	}

}
