import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		char choice;
		
		choice = getChoice();
		displayAlphabet(choice);
		

	}
	public static char getChoice() {
		char choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("Display alphabet in uppercase or lowercase?");
		System.out.print("Enter a U of L: ");
		choice = scan.next().toUpperCase().charAt(0);
		scan.close();
		return choice;
	}
	public static void displayAlphabet(char choice) {
		char letter;
		if (choice == 'U') {
			letter = 'A';
			while (letter <= 'Z') {
				System.out.print(letter + "\t");
				letter++;
			}
		}
		else if (choice == 'L') {
			letter = 'a';
			while (letter <= 'z') {
				System.out.print(letter + "\t");
				letter++;
			}
		}
		else 
			System.out.print("Invalid Entry!");
	}

}
