import java.util.Scanner;
import java.text.DecimalFormat;
public class MathCalculator {
	public static void main(String[] args) {
		double num1;
		double num2;
		char choice;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat twoDigits = new DecimalFormat("#,###,###.00");
		System.out.println("Welcome to the Calculator\nEnter the first operand: ");
		num1 = scan.nextDouble();
		
		System.out.println("Enter the second operand: ");
		num2 = scan.nextInt();
		
		System.out.println("Whats your choice?  ");
		choice = scan.next().charAt(0);
		
		switch(choice) {
		case 'A':
		case 'a': System.out.println("the sum is " + twoDigits.format(num1 + num2));
		break;
		case 'S': 
		case 's': System.out.println("the difference is " + twoDigits.format(num1 - num2));
		break;
		case 'M': 
		case 'm': System.out.println("the product is " + twoDigits.format(num1 * num2));
		break;
		case 'D':
		case 'd': 
			if (num2 == 0) 
				System.out.println("Cannot divide by 0!");
			else
				System.out.println("the quotient is " + twoDigits.format(num1 / num2));
		break;
		default: System.out.println("Invalid Entry!");
		break;
		}
		
		scan.close();

	}

}
