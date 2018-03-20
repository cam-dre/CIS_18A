import java.util.Scanner;

public class FindLowest {
	public static void main(String[] args) {
		int lowest;
		int num1;
		int num2;
		int num3;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		num1 = scan.nextInt();
		
		System.out.print("Enter the second integer: ");
		num2 = scan.nextInt();
		
		System.out.print("Enter the third integer: ");
		num3 = scan.nextInt();
		
		if (num1 < num2)
			lowest = num1;
		else
			lowest = num2;
		
		if (num3 < lowest)
			lowest = num3;
		
		System.out.println("The smallest is " + lowest);
		scan.close();
	}
}
