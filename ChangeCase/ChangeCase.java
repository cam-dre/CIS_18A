// =================================================================================
// File: HW_3b - ChangeCase
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
import java.util.Scanner;

public class ChangeCase {
	public static void main(String[] args) {
		String name;
		char choice;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first name:  ");
		name = scan.next();
		
		System.out.print("Display your name in uppercase(U) or lowercase(L)?"
				+ "  Enter U or L:  ");
		choice = scan.next().toUpperCase().charAt(0);
		
		if (choice == 'U')
			System.out.println("Your first name in uppercase is:  "
					+ name.toUpperCase() + ".");
		else if (choice == 'L')
			System.out.println("Your first name in lowercase is:  "
					+ name.toLowerCase() + ".");
		else
			System.out.println("Invalid entry - must be U or L.");
		scan.close();	
	}
}

/* ==== OUTPUT =====================================================================
Enter your first name:  cameron
Display your name in uppercase(U) or lowercase(L)?  Enter U or L:  u
Your first name in uppercase is:  CAMERON.
==================================================================================*/

/* ==== OUTPUT =====================================================================
Enter your first name:  CAMERON
Display your name in uppercase(U) or lowercase(L)?  Enter U or L:  L
Your first name in lowercase is:  cameron.
==================================================================================*/
