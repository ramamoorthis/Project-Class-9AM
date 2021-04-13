package org.comp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 {

	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class");

	}
	@AfterClass
	private void afterClass() {
	System.out.println("After Class");
	}
	@BeforeMethod
	private void beforeMethod() {
		// TODO Auto-generated method stub
	System.out.println("Before Method");
	}
	@AfterMethod
	private void afterMethod() {
		// TODO Auto-generated method stub
	System.out.println("After method");
	}
	@Test
	private void tc10() {
		// TODO Auto-generated method stub
	System.out.println("Test 10");
	}
	@Test
	private void tc11() {
		// TODO Auto-generated method stub
	System.out.println("Test 11");
	}
	@Test
	private void tc12() {
		// TODO Auto-generated method stub
	System.out.println("Test 12");
	}
	@Test
	private void tc13() {
		// TODO Auto-generated method stub
	System.out.println("Test 13");
	}
	@Test
	private void tc14() {
		// TODO Auto-generated method stub
	System.out.println("Test 14");
	}
	}

