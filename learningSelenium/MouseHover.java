package com.gurmeen.learningmaven.learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover {

	WebDriver driver;
	// instantiating actions class
	Actions action;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\Chrome Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20");

		driver.manage().window().maximize();
	}

	@Test
	public void mouseHover() {

		WebElement mouseHoverElement = driver.findElement(By.cssSelector(
				"div.product-layout.product-grid:nth-of-type(2) div.product-thumb>div:last-of-type>div.button-group>button:last-of-type>i"));

		action.moveToElement(mouseHoverElement).perform();
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
