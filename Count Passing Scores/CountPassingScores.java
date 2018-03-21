// =================================================================================
// Attached: HW_4a, 4b, 4c
// =================================================================================
// File: HW_4a - CountPassingScores
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
import java.util.Scanner;
import java.text.DecimalFormat;

public class CountPassingScores {
	public static void main(String[] args) {
		int score = 0;
		int count = 0;
		int passed = 0;
		double percentPassed;
		Scanner scan = new Scanner(System.in);
		DecimalFormat percent = new DecimalFormat("#0.0%");
		
		System.out.println("This program counts the number "
				+ "of passing test scores.\n");
		
		// loop continues until user enters -1
		while (score != -1) {
			System.out.print("Enter the first score: ");
			score = scan.nextInt();
			// count keeps track of scores entered
			count ++;
			
			// if user enters a score greater than or equal to 70
			// number passed is increased
			if (score >= 70)
				passed++;
		}
		// percent passed is calculated
		percentPassed = (double) passed / (count - 1);
		System.out.println("\nYou entered " + (count - 1) + " scores");
		System.out.println("The number of passing test scores is " + passed);
		System.out.println(percent.format(percentPassed) 
				+ " of the class passed the test");
		scan.close();
	}
}

/* ==== OUTPUT =====================================================================
This program counts the number of passing test scores.

Enter the first score: 92
Enter the first score: 77
Enter the first score: 55
Enter the first score: 88
Enter the first score: -1

You entered 4 scores
The number of passing test scores is 3
75.0% of the class passed the test
 =================================================================================*/

/* ==== OUTPUT =====================================================================
This program counts the number of passing test scores.

Enter the first score: 66
Enter the first score: 77
Enter the first score: 88
Enter the first score: 99
Enter the first score: 55
Enter the first score: 12
Enter the first score: 16
Enter the first score: 45
Enter the first score: 54
Enter the first score: -1

You entered 9 scores
The number of passing test scores is 3
33.3% of the class passed the test
 =================================================================================*/
