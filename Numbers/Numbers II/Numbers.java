import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		int num;
		
		num = getNumber();
		showNumber(num);

	}
	public static int getNumber() {
		int num = 0;
		int count = 0;
		boolean notNegative = false;
		Scanner scan = new Scanner(System.in);
		
		while (notNegative == false && count < 3)
		{
			System.out.print("Enter a positive number: ");
			num = scan.nextInt();
			
			notNegative = isPositive(num);
			count++;
		}
		if (count == 3 && notNegative == false) {
			System.out.println("Three invalid entries... now closing.\n\n");
			System.exit(0);
		}
		scan.close();
		return num;
	}
	public static boolean isPositive(int num) {
		return num > 0;
	}
	public static void showNumber(int num) {
		System.out.println("The number you entered was " + num + ".\n");
	}

}
