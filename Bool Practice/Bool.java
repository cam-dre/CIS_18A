import java.util.Scanner;
import java.text.DecimalFormat;

public class Bool {

	public static void main(String[] args) {
		double num;
		boolean again = true;
		char choice;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat twoDigits = new DecimalFormat("###.00");
		
		while (again) {
			System.out.print("Enter a number:  ");
			num = scan.nextDouble();
			System.out.println("The square root of " + num + " equals " + twoDigits.format(Math.sqrt(num)));
			System.out.println(num + " squared equals " + twoDigits.format(Math.pow(num, 2)));
			System.out.print("Do again (Y or N)?  ");
			choice = scan.next().charAt(0);
			
			if (choice != 'Y' && choice != 'y') {
				again = false;
			}
		}
		scan.close();
	}
}
