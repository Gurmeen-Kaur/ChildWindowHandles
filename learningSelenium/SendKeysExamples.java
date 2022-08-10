package com.gurmeen.learningmaven.learningSelenium;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SendKeysExamples {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\Chrome Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		driver.manage().window().maximize();
	}

	@Test
	public void test() {

		WebElement firstNameInput = driver.findElement(By.id("input-firstname"));
		firstNameInput.sendKeys("Gurmeen");

		WebElement lastNameInput = driver.findElement(By.cssSelector("#input-lastname"));
		lastNameInput.sendKeys("Kaur");

		WebElement emailInput = driver.findElement(By.cssSelector("#input-email"));
		emailInput.sendKeys("abc123@gmail.com");

		WebElement telephoneNumberInput = driver.findElement(By.id("input-telephone"));
		telephoneNumberInput.sendKeys("9876543210");

		WebElement passwordInput = driver.findElement(By.cssSelector("#input-password"));
		passwordInput.sendKeys("abc1234");

		WebElement confirmPasswordInput = driver.findElement(By.id("input-confirm"));
		confirmPasswordInput.sendKeys("abc1234");

		WebElement clickButton = driver.findElement(By.cssSelector("div.buttons input:last-of-type"));
		clickButton.click();

	}

	@AfterMethod
	public void tearDown() {

//		driver.close();
	}

}
