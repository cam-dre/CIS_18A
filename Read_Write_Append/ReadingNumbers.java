import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingNumbers {
	public static void main(String[] args) throws IOException {
		int number;
		File infile = new File("C:\\x\\numbers.txt");
		Scanner scan = new Scanner(infile);
		
		System.out.println("Here are all the even numbers:");
		
		while (scan.hasNext()) {
			number = scan.nextInt();
			
			// checks if even
			if (number % 2 == 0)
				System.out.println(number);
		}
		scan.close();
	}
}
