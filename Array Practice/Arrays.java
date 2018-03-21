import java.text.DecimalFormat;

public class Arrays {
	public static void main(String[] args) {
		double[] numbers = {5.5, 2.7, 1.4, 3.3, 4.4, 2.95};
		double total = 0;
		DecimalFormat twoDigit = new DecimalFormat("###.00"); 
		
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		
		System.out.println("The average is " + twoDigit.format(total / numbers.length));
	}
}
