import java.util.Scanner;
import java.text.DecimalFormat;

public class MathCalculator {
	public static void main(String[] args) {
		double num1;
		double num2;
		char choice;
		Scanner scan = new Scanner(System.in);
		DecimalFormat twoDigits = new DecimalFormat("###.00");
		
		System.out.println("Welcome to the Calculator");
		System.out.print("Enter the first operand: ");
		num1 = scan.nextDouble();
		System.out.print("Enter the second operand: ");
		num2 = scan.nextDouble();
		System.out.println("\nOperations are:"
				+ "\n\tA. for addition"
				+ "\n\tS. for subtraction"
				+ "\n\tM. for multiplication"
				+ "\n\tD. for division");
		System.out.print("Enter your selection: ");
		choice = scan.next().toUpperCase().charAt(0);
		
		switch (choice) {
		case 'A': System.out.println("The sum is " + twoDigits.format(num1 + num2));
			break;
		case 'S': System.out.println("The diffence is " + twoDigits.format(num1 - num2));
			break;
		case 'M': System.out.println("The product is " + twoDigits.format(num1 * num2));
			break;
		case 'D':
			if (num2 == 0)
				System.out.println("Cannot divide by zero.");
			else
				System.out.println("The quotient is " + twoDigits.format(num1 / num2));
			break;
		default: System.out.println("Invalid Entry!");
			break;
		}
		scan.close();
	}
}
