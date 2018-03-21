import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPractice {
	public static void main(String[] args) {
		int limit;
		DecimalFormat twoDigit = new DecimalFormat("###.00");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an upper limit: ");
		limit = scan.nextInt();
		System.out.println("Here are all the numbers from 1 to " + limit);
		
		for (int i = 1; i < limit; i++) {
				System.out.print(i + "\t" + twoDigit.format(Math.sqrt(i)));
				System.out.println("\t" + twoDigit.format((Math.pow(i, 2))));
		}
		scan.close();
	}
}
