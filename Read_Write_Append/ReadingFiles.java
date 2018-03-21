import java.io.*;
import java.util.Scanner;

public class ReadingFiles {
	public static void main(String[] args) throws IOException {
		int number;
		
		File inFile = new File("c:\\x\\numbers.txt");
		Scanner scan = new Scanner(inFile);
		
		System.out.println("Here are the numbers in the file:  ");
		while (scan.hasNext()) {
			number = scan.nextInt();
			System.out.println(number);
		}
		scan.close();
	}

}
