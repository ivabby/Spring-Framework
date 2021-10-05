package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();

	// Runs before every Test
	@Before
	public void before() {
		System.out.println("Before");
	}

	// Runs after every Test
	@After
	public void after() {
		System.out.println("After");
	}

	// Runs before the execution of class only once
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	// Runs after the execution of class only once
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	@Test
	public void sum_with3numbers() {
		System.out.println("Test 1");
		assertEquals(myMath.sum(new int[] { 1, 2, 3 }), 6);
	}

	@Test
	public void sum_with1numbers() {
		System.out.println("Test 2");
		assertEquals(3, myMath.sum(new int[] { 3 }));
	}

}
