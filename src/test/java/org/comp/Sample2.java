package org.comp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 {
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
	private void tc20() {
		// TODO Auto-generated method stub
	System.out.println("Test 20");
	}
	@Test
	private void tc21() {
		// TODO Auto-generated method stub
	System.out.println("Test 21");
	}
	@Test
	private void tc22() {
		// TODO Auto-generated method stub
	System.out.println("Test 22");
	}
	@Test
	private void tc23() {
		// TODO Auto-generated method stub
	System.out.println("Test 23");
	}
	@Test
	private void tc24() {
		// TODO Auto-generated method stub
	System.out.println("Test 24");
	}
}
