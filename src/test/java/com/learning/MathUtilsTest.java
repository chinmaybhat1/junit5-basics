package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {

		MathUtils mathUtils = new MathUtils();
		int result = mathUtils.add(10, 20);

		assertEquals(30, result, "The add method should add two numbers");
	}

	@Test
	void testCalculateAreaOfCircle() {

		MathUtils mathUtils = new MathUtils();
		double result = mathUtils.calculateAreaOfCircle(10);

		assertEquals(314.1592653589793, result, "The calculateAreaOfCircle method should find area of a circle");
	}

}
