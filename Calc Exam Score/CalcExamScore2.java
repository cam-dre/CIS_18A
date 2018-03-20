import java.util.Scanner;
public class CalcExamScore2 {
	public static void main(String[] args) {
		int grade;
		char letterGrade;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your test grade:  ");
		grade = scan.nextInt();
		
		if (grade >= 90) {
			letterGrade = 'A';
		}
		else if (grade >= 80) {
			letterGrade = 'B';
		}
		else if (grade >= 70) {
			letterGrade = 'C';
		}
		else if (grade >= 60) {
			letterGrade = 'D';
		}
		else {
			letterGrade = 'F';
		}
		
		System.out.println("Your test grade of " + grade + " is a letter grade of " + letterGrade);
		scan.close();
	}
}
