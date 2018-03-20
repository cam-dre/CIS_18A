import java.util.Scanner;
public class Char {
	public static void main(String[] args) {
		char character;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a keyboard character: ");
		character = scan.next().charAt(0);
		
		if ((character >= 'A'  && character <= 'Z') || (character >= 'a' && character <= 'z')) {
			System.out.println("It's alphabetic");
			
			if (character >= 'A' && character <= 'Z')
				System.out.println("It's uppercase");
			else 
				System.out.println("It's lowercase");
		}
		else 
			System.out.println("It's not alphabetic");
		scan.close();
	}
}
