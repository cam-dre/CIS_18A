// =================================================================================
// Attached: HW_3a, 3b
// =================================================================================
// File: HW_3a - MathOperations
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
import java.util.Scanner;

public class MathOperations {
	public static void main(String[] args) {
		int num1;
		int num2;
		char choice;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer value:  ");
		num1 = scan.nextInt();
		System.out.print("Enter another integer value:  ");
		num2 = scan.nextInt();
		System.out.print("\n\tA. Addition"
				+ "\n\tB. Subtract"
				+ "\n\tC. Multiply"
				+ "\n\tD. Divide"
				+ "\n\nWhat type of math operation do you want to perform "
				+ "(Enter a selection):  ");
		choice = scan.next().toUpperCase().charAt(0);
		
		switch(choice) {
		case 'A': System.out.println(num1 + " + " + num2 + " = "
				+ (num1 + num2) + ".");
			break;
		case 'B': System.out.println(num1 + " - " + num2 + " = "
				+ (num1 - num2) + ".");
			break;
		case 'C': System.out.println(num1 + " * " + num2 + " = "
				+ (num1 * num2) + ".");
			break;
		case 'D':
			if (num2 == 0)
				System.out.println("Cannot divide by zero!");
			else
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)
						+ " with a remainder of " + (num1 % num2) + ".");
			break;
		default: System.out.println("Invalid Entry!");
			break;
		}	
		scan.close();
	}
}

/* ==== OUTPUT - when choice is A ==================================================
Enter an integer value:  5
Enter another integer value:  2

	A. Addition
	B. Subtract
	C. Multiply
	D. Divide

What type of math operation do you want to perform (Enter a selection):  A
5 + 2 = 7.
==================================================================================*/

/* ==== OUTPUT - when choice is B ==================================================
Enter an integer value:  5
Enter another integer value:  2

	A. Addition
	B. Subtract
	C. Multiply
	D. Divide

What type of math operation do you want to perform (Enter a selection):  b
5 - 2 = 3.
==================================================================================*/

/* ==== OUTPUT - when choice is C ==================================================
Enter an integer value:  5
Enter another integer value:  2

	A. Addition
	B. Subtract
	C. Multiply
	D. Divide

What type of math operation do you want to perform (Enter a selection):  C
5 * 2 = 10.

==================================================================================*/

/* ==== OUTPUT - when choice is D ==================================================
Enter an integer value:  5
Enter another integer value:  2

	A. Addition
	B. Subtract
	C. Multiply
	D. Divide

What type of math operation do you want to perform (Enter a selection):  d
5 / 2 = 2 with a remainder of 1.
==================================================================================*/

/* ==== OUTPUT - when choice is D (num2 == 0) ======================================
Enter an integer value:  5
Enter another integer value:  0

	A. Addition
	B. Subtract
	C. Multiply
	D. Divide

What type of math operation do you want to perform (Enter a selection):  d
Cannot divide by zero!
==================================================================================*/

/* ==== OUTPUT - when choice Invalid ===============================================
Enter an integer value:  5
Enter another integer value:  2

	A. Addition
	B. Subtract
	C. Multiply
	D. Divide

What type of math operation do you want to perform (Enter a selection):  L
Invalid Entry!
==================================================================================*/