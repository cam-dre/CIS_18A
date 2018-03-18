// =====================================================================================
// File: HW_2b - ArithmeticOperations
// =====================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =====================================================================================
public class ArithmeticOperations {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 3;
		int sum = 0;
		int difference = 0;
		int product = 0;
		int quotient = 0;
		int modulus = 0;
		
		sum = number1 + number2;
		difference = number1 - number2;
		product = number1 * number2;
		quotient = number1 / number2;
		modulus = number1 % number2;
		
		System.out.println("number1 is " + number1);
		System.out.println("number2 is " + number2);
		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + difference);
		System.out.println("The product is " + product);
		System.out.println("The quotient is " + quotient);
		System.out.println("The modulus is " + modulus);
	}
}

/* ==== OUTPUT =========================================================================
number1 is 10
number2 is 3
The sum is 13
The difference is 7
The product is 30
The quotient is 3
The modulus is 1
======================================================================================*/