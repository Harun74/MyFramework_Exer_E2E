package com.testNGChallanges;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 2)
	public void getMethod1() {
		System.out.println("Get method1");
		
	}
	@Test(priority = 3)
	public void getMethod2() {
		System.out.println("Get method2");
		
	}
	@Test(priority = 4)
	public void getMethod3() {
		System.out.println("Get method3");
	}
	@Test(priority = 1)
	public void getMethod4() {
		System.out.println("Get method4");
		
	}
	@Test(priority = 0)
	public void getMethod5() {
		System.out.println("Get method5");
		
	}

}
