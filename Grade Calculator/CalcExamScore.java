import java.util.Scanner;

public class CalcExamScore {
	public static void main(String[] args) {
		int score;
		int extraCredit;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your test grade: ");
		score = scan.nextInt();
		
		System.out.print("Enter your extra credit: ");
		extraCredit = scan.nextInt();
		
		if (extraCredit > 0)
			score += extraCredit;
		
		System.out.println("Your final test grade is " + score);
		scan.close();
	}
}
