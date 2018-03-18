// =================================================================================
// Attached: HW_5a, 5b
// =================================================================================
// File: HW_5a - DoTheMath_A
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
import java.util.Scanner;
import java.text.DecimalFormat;

public class DoTheMath_A {
	public static void main(String[] args) {
		double num1;
		double num2;
		double result;
		int selection;
		
		// num1 is assigned a value by user
		num1 = getFirstNumber();
		// num2 is assighed a value by user
		num2 = getSecondNumber();
		// Math menu is output to screen
		showMenu();
		// user makes a selection from math menu
		selection = getSelection();
		// result is found based on selection made by user
		result = doTheMath(num1, num2, selection);
		// result is displayed
		displayResult(num1, num2, result, selection);
	}
	public static double getFirstNumber() {
		double num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		num = scan.nextDouble();
		return num;
	}
	public static double getSecondNumber() {
		double num;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the second number - (Cannot be zero): ");
		num = scan.nextDouble();
		
		// this code repeats while the second number is equal to zero
		while (num == 0) {
			System.out.println("\nSecond number cannot be zero!");
			System.out.print("Enter the second number - (Cannot be zero): ");
			num = scan.nextDouble();
		}
		return num;
	}
	public static void showMenu() {
		System.out.println("\n1. Addition"
				+ "\n2. Subtraction"
				+ "\n3. Multiply"
				+ "\n4. Divide");
	}
	public static int getSelection() {
		int selection;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nWhich math operation? Enter your choice: ");
		selection = scan.nextInt();
		
		// this code will loop as long as a number from 1-4 is not chosen
		while (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
			System.out.println("\nInvalid Entry!");
			System.out.print("Which math operation? Enter your choice: ");
			selection = scan.nextInt();
		}
		System.out.println();
		return selection;
	}
	public static double doTheMath(double num1, double num2, int selection) {
		double result = 0;
		switch (selection) {
		case 1: result = num1 + num2;
			break;
		case 2: result = num1 - num2;
			break;
		case 3: result = num1 * num2;
			break;
		case 4: result = num1 / num2;
			break;
		}
		return result;
	}
	public static void displayResult(double num1, double num2, double result, int selection) {
		DecimalFormat oneDigit = new DecimalFormat("#.0");
		
		switch (selection) {
		case 1: System.out.println(oneDigit.format(num1) + " + "
				+ oneDigit.format(num2) + " = " + oneDigit.format(result));
			break;
		case 2: System.out.println(oneDigit.format(num1) + " - "
				+ oneDigit.format(num2) + " = " + oneDigit.format(result));
			break;
		case 3: System.out.println(oneDigit.format(num1) + " * "
				+ oneDigit.format(num2) + " = " + oneDigit.format(result));
			break;
		case 4: System.out.println(oneDigit.format(num1) + " / "
				+ oneDigit.format(num2) + " = " + oneDigit.format(result));
		}
	}
}

/* ==== OUTPUT =====================================================================
Enter the first number: 5
Enter the second number - (Cannot be zero): 2

1. Addition
2. Subtraction
3. Multiply
4. Divide

Which math operation? Enter your choice: 4

5.0 / 2.0 = 2.5
==================================================================================*/

/* ==== OUTPUT =====================================================================
Enter the first number: 89
Enter the second number - (Cannot be zero): 0

Second number cannot be zero!
Enter the second number - (Cannot be zero): 0

Second number cannot be zero!
Enter the second number - (Cannot be zero): 0

Second number cannot be zero!
Enter the second number - (Cannot be zero): 75

1. Addition
2. Subtraction
3. Multiply
4. Divide

Which math operation? Enter your choice: 2

89.0 - 75.0 = 14.0
==================================================================================*/

/* ==== OUTPUT =====================================================================
Enter the first number: 84
Enter the second number - (Cannot be zero): 0

Second number cannot be zero!
Enter the second number - (Cannot be zero): 0

Second number cannot be zero!
Enter the second number - (Cannot be zero): 74

1. Addition
2. Subtraction
3. Multiply
4. Divide

Which math operation? Enter your choice: 9

Invalid Entry!
Which math operation? Enter your choice: 9

Invalid Entry!
Which math operation? Enter your choice: 3

84.0 * 74.0 = 6216.0
==================================================================================*/

