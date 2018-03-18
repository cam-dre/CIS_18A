import java.util.Scanner;

public class ChangeCaseLoop {

	public static void main(String[] args) {
		String name;
		boolean again = false;
		Scanner scan = new Scanner(System.in);
		
		do {
		name = getName(scan);
		changeCase(name, scan);
		again = doAgain(scan);
		} while (again == true);
		
		scan.close();
	}
	public static String getName(Scanner scan) {
		System.out.print("Enter your first name:  ");
		return scan.next();
	}
	public static void changeCase(String name, Scanner scan) {
		char choice;
		System.out.print("Display your name in uppercase(U) or lowercase(L)?  Enter U or L:  ");
		choice = scan.next().toUpperCase().charAt(0);
		
		if (choice == 'U')
			System.out.println("Your first name in uppercase is:  " + name.toUpperCase() + ".");
		else if (choice == 'L')
			System.out.println("Your first name in lowercase is:  " + name.toLowerCase() + ".");
		else {
				System.out.println("Invalid entry - must be U or L.");
				changeCase(name, scan);
		}
	}
	public static boolean doAgain(Scanner scan) {
		char choice;
		System.out.print("Do you want to run the program again? Y or N  ");
		choice = scan.next().toUpperCase().charAt(0);
		
		if (choice == 'Y')
			return true;
		else if (choice == 'N')
			return false;
		else {
			System.out.println("Invalid Entry!");
			doAgain(scan);
			return false;
		}
	}
}
