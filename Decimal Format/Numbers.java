import java.util.Scanner;
import java.text.DecimalFormat;

public class Numbers {
	public static void main(String[] args) {
		double num;
		double sum = 0;
		double avg;
		int count = 1;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat twoDigits = new DecimalFormat("###.00");
		
		System.out.print("Enter 5 numbers\n");
		
		while (count < 6) {
			System.out.print("#" + count + ".\t");
			num = scan.nextDouble();
			sum += num;
			count++;
		}
		avg = sum / (count - 1);
		System.out.println("the sum of the five numbers is " + twoDigits.format(sum) + ".\nThe average is "+ twoDigits.format(avg));
		scan.close();
	}

}
