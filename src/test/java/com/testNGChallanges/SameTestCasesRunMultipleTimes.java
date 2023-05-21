package com.testNGChallanges;

import org.testng.annotations.Test;

public class SameTestCasesRunMultipleTimes {
	
@Test(invocationCount = 10)	
	public void getMethod() {
		
		System.out.println("GetMethod");
	}

}
