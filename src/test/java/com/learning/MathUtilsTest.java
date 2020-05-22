package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {

		MathUtils mathUtils = new MathUtils();
		int result = mathUtils.add(10, 20);
		assertEquals(30, result, "The add method should add two numbers");
	}

	@Test
	void testDivide() {

		MathUtils mathUtils = new MathUtils();
		assertThrows(NullPointerException.class, () -> mathUtils.divide(10, 0), "Divide by zero should throw");
	}

	@Test
	void testCalculateAreaOfCircle() {

		MathUtils mathUtils = new MathUtils();
		double result = mathUtils.calculateAreaOfCircle(10);
		assertEquals(314.1592653589793, result, "The calculateAreaOfCircle method should find area of a circle");
	}

}
