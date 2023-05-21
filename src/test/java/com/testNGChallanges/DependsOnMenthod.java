package com.testNGChallanges;

import org.testng.annotations.Test;

public class DependsOnMenthod {
	@Test
	public void getOpenBrowser() {
		System.out.println("getOpenBrowser");

	}

	@Test(dependsOnMethods = "getOpenBrowser")
	public void getLogin() {
		System.out.println("getLogin");

	}

	@Test(dependsOnMethods = "getLogin")
	public void getCloseBrowser() {
		System.out.println("getCloseBrowser");

	}

}
