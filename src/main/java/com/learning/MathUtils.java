package com.learning;

public class MathUtils {

	public int add(int number1, int number2) {
		return number1 + number2;
	}

	public int subtract(int number1, int number2) {
		return number1 - number2;
	}

	public int multiply(int number1, int number2) {
		return number1 * number2;
	}

	public int divide(int number1, int number2) {
		return number1 / number2;
	}

	public double calculateAreaOfCircle(int radius) {
		return Math.PI * radius * radius;
	}
}
