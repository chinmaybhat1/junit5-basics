package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@Test
	@EnabledOnOs(OS.MAC)//Does not execute the test if pre-condition is not met
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
		int radius = 0;
		boolean isValidRadius = validateRadius(radius);
		//Runs the test but skips if the condition is false
		assumeTrue(isValidRadius, "The radius should be a positive integer");
		double result = mathUtils.calculateAreaOfCircle(10);
		assertEquals(314.1592653589793, result, "The calculateAreaOfCircle method should find area of a circle");
	}

	private boolean validateRadius(int radius) {

		boolean isValid = false;

		if (radius > 0) {
			isValid = true;
		}

		return isValid;
	}

}
