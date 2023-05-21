package com.testNGChallanges;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class BasicAnnotation {
 @BeforeSuite
	public void getBeforeSuite() {
		System.out.println("Run getBeforeSuite");

	}
 @BeforeTest
	public void getBeforeTest() {
		System.out.println("Run getBeforeTest");

	}
 @BeforeClass
	public void getBeforeClass() {
		System.out.println("Run getBeforeClass");

	}
 @BeforeMethod
	public void getBeforeMethod() {
		System.out.println("Run getBeforeMethod");

	}
 @Test
	public void getTest() {
		System.out.println("Run getTest");

	}
@AfterMethod
	public void AfterMethod() {
		System.out.println("Run getAfterMethod");

	}
@AfterClass
	public void AfterClass() {
		System.out.println("Run getAfterClass");

	}
@AfterTest
	public void AfterTest() {
		System.out.println("Run getAfterTest");

	}
@AfterSuite
	public void AfterSuite() {
		System.out.println("Run getAfterSuite");

	}

}
