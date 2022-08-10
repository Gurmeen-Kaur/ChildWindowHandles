package com.gurmeen.learningmaven.learningSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentWindowHandle {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\Chrome Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
	}

	@Test
	public void windowHandle() {
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent window ID " + parentWindowHandle);

		WebElement newTabButton = driver.findElement(By.id("tabButton"));
		newTabButton.click();

		WebElement newWindowButton = driver.findElement(By.id("windowButton"));
		newWindowButton.click();

		Set<String> handle = driver.getWindowHandles();

		for (String windowHandle : handle) {
			if (!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				System.out.println("Current child Window ID is : " + windowHandle);
			}
		}

		// switching back to parent window handle
		driver.switchTo().window(parentWindowHandle);

	}

	@AfterMethod

	public void tearDown() {
		driver.close();
	}

}
