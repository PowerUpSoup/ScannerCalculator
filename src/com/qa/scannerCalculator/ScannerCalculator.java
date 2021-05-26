package com.qa.scannerCalculator;

public class ScannerCalculator {

	public static int add(int a, int b) {
		int result = a + b;
		System.out.println(result);
		return result;
	}
	
	public static int subtract(int a, int b) {
		int result = a - b;
		System.out.println(result);
		return result;
	}
	
	public static int multiply(int a, int b) {
		int result = a * b;
		System.out.println(result);
		return result;
	}
	
	public static int divide(int a, int b) {
		try {
			int result = a / b;
			System.out.println(result);
			return result;
		} catch(ArithmeticException e) {
			System.out.println("Dividing an integer by 0 is not supported by this calculator...");
			return 0;
		}
	}
}
