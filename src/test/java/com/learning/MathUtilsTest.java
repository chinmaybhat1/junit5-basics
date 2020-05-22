package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//Creates only a single instance of the class
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeAll
	void beforeAllInit() {
		System.out.println("Initialising before all");
	}

	@BeforeEach
	void init() {
		System.out.println("Initialising class that needs to be tested");
		mathUtils = new MathUtils();
	}

	@AfterEach
	void cleanup() {
		System.out.println("Performing cleanup");
		mathUtils = null;
	}

	@Test
	void testAdd() {
		int result = mathUtils.add(10, 20);
		assertEquals(30, result, "The add method should add two numbers");
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0), "Divide by zero should throw");
	}

	@Test
	void testCalculateAreaOfCircle() {
		double result = mathUtils.calculateAreaOfCircle(10);
		assertEquals(314.1592653589793, result, "The calculateAreaOfCircle method should find area of a circle");
	}

}
