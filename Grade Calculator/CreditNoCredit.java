import java.util.Scanner;

public class CreditNoCredit {
	public static void main(String[] args) {
		int score;
		String grade;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your test score:  ");
		score = scan.nextInt();
		
		if (score >= 70)
			grade = "CREDIT";
		else
			grade = "NO CREDIT";
		
		System.out.println("Based on a score of " + score + ",\nCredit/No Credit status is: " + grade);
		scan.close();
	}
}
