import java.util.Scanner;

public class CalcGrade {
	public static void main(String[] args) {
		int score;
		char grade;
		
		score = getScore();
		grade = getGrade(score);
		displayGrade(score, grade);

	}
	public static int getScore() {
		int score;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a test score: ");
		score = scan.nextInt();
		scan.close();
		return score;
	}
	public static char getGrade(int score) {
		char grade;
		
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
		return grade;
	}
	public static void displayGrade(int score, char grade) {
		System.out.print("Your score was " + score + " that's a(n) " + grade);
	}

}
