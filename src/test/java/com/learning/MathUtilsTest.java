package com.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
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
			int expected = -10;
			int actual = mathUtils.add(-10, -20);
			assertEquals(expected, actual, () -> "should return sum " + expected + " but returned " + actual);
		}
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0), "Divide by zero should throw");
	}

	@RepeatedTest(3)
	void testCalculateAreaOfCircle(RepetitionInfo repetitionInfo) {
		if (1 != repetitionInfo.getCurrentRepetition()) {
			System.out.println("Calculation area of a circle.");
			assertEquals(314.1592653589793, mathUtils.calculateAreaOfCircle(10),
					"The calculateAreaOfCircle method should find area of a circle");
		}
	}

}
