import java.util.Scanner;

public class NegativeToPositive {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter negative numbers (0 to quit):\n");
		
		
		do {
			System.out.print("Enter a negative number:  ");
			num = scan.nextInt();
			
			if (num != 0)
				System.out.println("The absolute value of " + num + " equals " + Math.abs(num) + "\n");
			else
				System.out.println("Goodbye!");
		} while (num != 0);
		scan.close();
	}
}
