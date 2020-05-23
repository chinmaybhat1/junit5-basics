package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("When running MathUtils")
class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@Nested
	@DisplayName("add method")
	class AddTest {

		@Test
		@DisplayName("when adding two positive numbers")
		void testAddPositive() {
			assertEquals(30, mathUtils.add(10, 20), "should return the right sum");
		}

		@Test
		@DisplayName("when adding two negative numbers")
		void testAddNegative() {
			assertEquals(-10, mathUtils.add(-10, -20), "should return the right sum");
		}
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
