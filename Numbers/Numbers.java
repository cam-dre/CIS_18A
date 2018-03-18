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
		return num;
	}
	public static boolean isPositive(int num) {
		if (num > 0)
			return true;
		else
			return false;
	}
	public static void showNumber(int num) {
		if (num > 0)
			System.out.println("The number you entered was: " + num);
		else
			System.exit(0);
	}

}
