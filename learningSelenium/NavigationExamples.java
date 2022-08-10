package com.gurmeen.learningmaven.learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigationExamples {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\Chrome Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		driver.manage().window().maximize();
	}

	@Test
	public void navigationTest() {

		// getting title before navigating to new URL
		System.out.println("Page title before navigating : " + driver.getTitle());

		// navigating to new URL
		driver.navigate().to("https://www.youtube.com/");

		// getting title before navigating to new URL
		System.out.println("Page title after navigating : " + driver.getTitle());

		// navigating back to previous page
		driver.navigate().back();
		System.out.println("Title after navigating backward : " + driver.getTitle());

		// navigating forward
		driver.navigate().forward();
		System.out.println("Title after navigating forward : " + driver.getTitle());

		// refreshing page
		driver.navigate().refresh();
	}

	@AfterMethod
	public void tearDown() {
		// Close the browser
		driver.close();
	}

	public void sleep() {
		try {

			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
