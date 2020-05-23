package com.learning;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@Test
	void testAdd() {
		int result = mathUtils.add(10, 20);
		assertEquals(30, result, "The add method should add two numbers");
	}

	@Test
	@DisplayName("Multiply method")
	void testMultiply() {
		//Test multiple assert statements
		assertAll(
				() -> assertEquals(4, mathUtils.multiply(2, 2)),
				() -> assertEquals(0, mathUtils.multiply(2, 0)),
				() -> assertEquals(-2, mathUtils.multiply(2, -1))
		);
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
