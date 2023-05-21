package com.testNGChallanges;

import org.testng.annotations.Test;

public class EnableTrueFalse {
	
	@Test(enabled = true)
	public void getMethod1() {
		System.out.println("Get method1");
		
	}
	@Test(enabled = true)
	public void getMethod2() {
		System.out.println("Get method2");
		
	}
	@Test(enabled = false)
	public void getMethod3() {
		System.out.println("Get method3");
	}
	@Test(enabled = false)
	public void getMethod4() {
		System.out.println("Get method4");
		
	}
	@Test(enabled = true)
	public void getMethod5() {
		System.out.println("Get method5");
		
	}

}
