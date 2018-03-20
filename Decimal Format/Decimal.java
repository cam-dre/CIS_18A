import java.text.DecimalFormat;

public class Decimal {
	public static void main(String[] args) {
		double avg = 12345.123;
		
		DecimalFormat twoDigits = new DecimalFormat("$###,###.00");
		System.out.println("Average sale is:  " + twoDigits.format(avg));
	}
}
