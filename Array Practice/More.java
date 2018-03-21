import java.util.Scanner;
import java.io.*;

public class More {

	public static void main(String[] args) throws IOException {
		final int SIZE = 5;
		int[] numbers = new int[SIZE];
		Scanner scan = new Scanner(System.in);
		PrintWriter outFile = new PrintWriter ("c:\\x\\numbers.txt");
		
		System.out.println("Enter " + SIZE + " numbers.");
		for (int i = 0; i < SIZE; i++) {
			System.out.print("#" + (i + 1) + ": ");
			numbers[i] = scan.nextInt();
			outFile.println(numbers[i]);
		}
		System.out.println("The numbers have been written to the file");
		outFile.close();
		scan.close();
	}

}
