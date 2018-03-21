import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		int high = 0;
		int low = 0;
		String digits;
		String numAsString;
		
		char[] anArray;
		
		System.out.print("Enter string of numbers: ");
		digits = scan.nextLine();
		
		// String digits is converted to a char array and then 
		// assigned to anArray
		anArray = digits.toCharArray();
		
		for (int i = 0; i < anArray.length; i++) {
			// Each digit in the array is converted to a string digit
			// and assigned to a String variable
			numAsString = String.valueOf(anArray[i]);
			num = Integer.parseInt(numAsString);
			sum += num;
			
			if (i == 0) {
				high = num;
				low = num;
			}
			else {
				if (num > high)
					high = num;
				if (num < low)
					low = num;
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println("High: " + high);
		System.out.println("Low: " + low);
		scan.close();
	}
}