import java.util.Scanner;
public class Test_Score {

	public static void main(String[] args) {
		int testScore;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your test score:  ");
		
		testScore = scan.nextInt();
		
		if (testScore >= 70) {
			System.out.println("Credit.\n");
		}
		else {
			System.out.println("No Credit.\n");
		}
		scan.close();
	}
}
