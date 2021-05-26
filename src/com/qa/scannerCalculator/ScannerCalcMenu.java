package com.qa.scannerCalculator;

import java.util.Scanner;

public class ScannerCalcMenu {

	public static void scannerCalcMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please choose an option by typing a number:");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("Type 'e' to Exit...");
		
		String option = scan.nextLine();
		
		switch (option) {
		case "1": 
			System.out.println("Please enter a number to Add:");
			String adda = scan.nextLine();
			System.out.println("Please enter another number to Add:");
			String addb = scan.nextLine();
			int addnum1 = Integer.parseInt(adda);
			int addnum2 = Integer.parseInt(addb);
			ScannerCalculator.add(addnum1, addnum2);
			scannerCalcMenu();
			break;
		case "2":
			System.out.println("Please enter a number to Subtract:");
			String suba = scan.nextLine();
			System.out.println("Please enter another number to Add:");
			String subb = scan.nextLine();
			int subnum1 = Integer.parseInt(suba);
			int subnum2 = Integer.parseInt(subb);
			ScannerCalculator.subtract(subnum1, subnum2);
			scannerCalcMenu();
			break;
		case "3":	
			System.out.println("Please enter a number to Multiply:");
			String mula = scan.nextLine();
			System.out.println("Please enter another number to Multiply:");
			String mulb = scan.nextLine();
			int mulnum1 = Integer.parseInt(mula);
			int mulnum2 = Integer.parseInt(mulb);
			ScannerCalculator.multiply(mulnum1, mulnum2);
			scannerCalcMenu();
			break;
		case "4":
			System.out.println("Please enter a number to Divide:");
			String diva = scan.nextLine();
			System.out.println("Please enter another number to Divide the previous number by:");
			String divb = scan.nextLine();
			int divnum1 = Integer.parseInt(diva);
			int divnum2 = Integer.parseInt(divb);
			ScannerCalculator.divide(divnum1, divnum2);
			scannerCalcMenu();
			break;
		case "exit":
			scan.close();
			System.out.println("Terminating Program...");
		default:
			System.out.println("That's not an option, please try again...");
			scannerCalcMenu();
			break;
			
		}
			 
	}
}
