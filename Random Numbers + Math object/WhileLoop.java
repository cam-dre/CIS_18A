import java.util.Scanner;
import java.text.DecimalFormat;

public class WhileLoop {
	public static void main(String[] args) {
		double num;
		char choice = 'Y';
		String strChoice;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat twoDigits = new DecimalFormat("###.00");
		
		while (choice == 'Y') {
			System.out.print("Enter a number:  ");
			num = scan.nextDouble();
			System.out.println("The square root of " + num + " equals " + twoDigits.format(Math.sqrt(num)));
			System.out.println(num + " squared equals " + twoDigits.format(Math.pow(num, 2)));
			
			System.out.print("Do again (Y or N)?  ");
			strChoice = scan.next();
			strChoice = strChoice.toUpperCase();
			choice = strChoice.charAt(0);
		}
		scan.close();
	}
}
