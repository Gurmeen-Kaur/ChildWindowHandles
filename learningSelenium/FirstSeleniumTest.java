package com.gurmeen.learningmaven.learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		// basic setup to begin with Selenium
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\Chrome Drivers\\chromedriver.exe");

		// Opens up browser
		driver = new ChromeDriver();

		// load URL
		driver.get("https://www.amazon.com/");

		// maximize the screen
		driver.manage().window().maximize();

	}

	@Test
	public void test1() {
		String titleOfPage = driver.getTitle();
		System.out.println("Title of the page is " + titleOfPage);
		
		Assert.assertEquals(titleOfPage, "Amazon.com. Spend less. Smile more.", "Title doesn't match");
	}

	@AfterMethod
	public void tearDown() {
		// close the browser
		driver.close();
	}

}
