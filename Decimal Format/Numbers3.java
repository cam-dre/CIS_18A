import java.util.Scanner;
import java.text.DecimalFormat;

public class Numbers3 {

	public static void main(String[] args) {
		double num;
		double sum = 0;
		double avg;
		int i;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat twoDigits = new DecimalFormat("###.00");
		
		System.out.print("Enter 5 numbers\n");
		
		for (i = 1; i < 6; i++) {
			System.out.print("#" + i + ".\t");
			num = scan.nextDouble();
			sum += num;
		}
		
		avg = sum / (i - 1);
		System.out.println("the sum of the five numbers is " + twoDigits.format(sum) + ".\nThe average is "+ twoDigits.format(avg));
		scan.close();

	}

}
