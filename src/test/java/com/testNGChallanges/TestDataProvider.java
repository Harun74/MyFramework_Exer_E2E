package com.testNGChallanges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDataProvider {
	WebDriver driver;
	
	// Object is the parent/super class of java store all types of data.

	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		return new Object[][] { { "tanvirpatwary16@gmail.com", "Tester01" },
								{ "tanvirpatwary45@gmail.com", "Tester001" }, 
								{ "tanvirpatwary00@gmail.com", "Tester000" },
								{ "test123456565656@gmail.com", "dsfsf" } };
	}
@Test(dataProvider = "Authentication")	
	
	public void getLogin(String UserName, String Password) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.automationexercise.com/login");
	driver.manage().window().maximize();
		
	}

}
