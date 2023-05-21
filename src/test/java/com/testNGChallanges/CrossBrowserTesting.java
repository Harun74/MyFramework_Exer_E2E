package com.testNGChallanges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	WebDriver driver;

	@BeforeMethod
	@Parameters("Browsers") //@Parameters one of the advance annotation inTestNG  which we use to run cross browser testing.
	public void initialization(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Test will execute with chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.out.println("Test will execute with edge browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}

	@AfterMethod // Before it was coming from cucumber, but now it is coming from TestNG
	public void getCloserowser() {
		driver.quit();
		System.out.println("Browser closed");

	}

	@Test // Same test cases will run in multiple browsers
	public void getLogin() {
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("Login the application");

	}

}
