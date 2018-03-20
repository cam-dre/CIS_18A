import java.util.Scanner;

public class CalcLetterGrade {
	public static void main(String[] args) {
		int grade;
		char letterGrade;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your test grade: ");
		grade = scan.nextInt();
		
		if (grade >= 90)
			letterGrade = 'A';
		else if (grade >= 80)
			letterGrade = 'B';
		else if (grade >= 70)
			letterGrade = 'C';
		else if (grade >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';
		
		System.out.print("Your test grade of " + grade + " is a letter grade of " + letterGrade);
		scan.close();
	}
}
