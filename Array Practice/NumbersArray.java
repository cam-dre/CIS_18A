import java.util.Scanner;

public class NumbersArray {
	public static void main(String[] args) {
		final int SIZE = 5;
		int[] numbers = new int[SIZE];
		
		getNumbers(numbers, SIZE);
		showSum(numbers, SIZE);
	}
	public static void getNumbers(int[] numbers, int size) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter " + size + " integer values:");
		for (int i = 0; i < size; i++) {
			System.out.print("# " + (i + 1) + ": ");
			numbers[i] = scan.nextInt();	
		}
		scan.close();
	}
	public static void showSum(int[] numbers, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += numbers[i];
		}
		System.out.println("The sum equals " + sum + ".");
	}

}
