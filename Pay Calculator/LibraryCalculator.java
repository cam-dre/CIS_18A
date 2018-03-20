import java.util.Scanner;
import java.text.DecimalFormat;

public class LibraryCalculator {
	public static void main(String[] args) {
		double hours;
		double hourlyRate;
		double totalPay;
		DecimalFormat currencyFormat = new DecimalFormat("$###.00");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter hours worked: ");
		hours = scan.nextDouble();
		System.out.print("Enter hourly rate: ");
		hourlyRate = scan.nextDouble();
		
		if (hours <= 40)
			totalPay = hours * hourlyRate;
		else
			totalPay = (40 * hourlyRate) +((hours - 40) * (1.5 * hourlyRate));
		System.out.println("Total pay is " + currencyFormat.format(totalPay) + ".");
		scan.close();
	}
}
