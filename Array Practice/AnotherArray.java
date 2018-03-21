import java.util.Scanner;

public class AnotherArray {
	public static void main(String[] args) {
		final int SIZE = 100;
		int[] values = new int[SIZE];
		double avg = 0.0;
		int sum = 0;
		int temp = 0;
		int count = 0;
		//int lowest;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 5 postitive values. -1 to quit.");
		for (int i = 0; i < SIZE; i++) {
			System.out.print("#" + (i + 1) + ": ");
			temp = scan.nextInt();
			
			if (temp == -1)
				break;
			values[i] = temp;
			count++;
		}
		/*lowest = values[0];
		for (int i = 0; i < SIZE; i++) {
			if (values[i] < lowest)
				lowest = values[i];
		}*/
		//System.out.println("The smallest value in the array is " + lowest);
		
		for (int i = 0; i < count; i++) {
			sum += values[i];
		}
		avg = (double) sum / count;
		System.out.println("The average is " + avg);
		scan.close();
	}
}
