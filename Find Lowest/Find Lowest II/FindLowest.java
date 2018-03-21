import java.util.Scanner;
public class FindLowest {
	public static void main(String[] args) {
		int lowest;
		int num1;
		int num2;
		int num3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		num1 = scan.nextInt();
		
		System.out.println("Enter the second integer: ");
		num2 = scan.nextInt();
		
		System.out.println("Enter the first integer: ");
		num3 = scan.nextInt();
		
		if ((num1 < num2) && (num1 < num3)) {
			lowest = num1;
		}
		else if ((num2 < num1) && (num2 < num3)) {
			lowest = num2;
		}
		else {
			lowest = num3;
		}
		
		System.out.println("The lowest is " + lowest);
		scan.close();
	}
}
