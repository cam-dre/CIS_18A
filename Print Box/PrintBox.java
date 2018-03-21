// =================================================================================
// File: HW_4b - PrintBox
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
import java.util.Scanner;

public class PrintBox {
	public static void main(String[] args) {
		int rows = 0;
		int cols = 0;
		boolean input = false;
		Scanner scan = new Scanner(System.in);
		
		while (input == false) {
			System.out.println("The box cannot be more than 60 stars wide and 10"
					+ " stars high.\nThe number of rows and columns must be"
					+ " greater than zero.");
			System.out.print("Enter the number of rows: ");
			rows = scan.nextInt();
			System.out.print("Enter the number of columns: ");
			cols = scan.nextInt();
			
			if ((rows <= 10 && cols <= 60) && (rows > 0 && cols > 0))
				input = true;
			else
				System.out.println("\n\n\n");
		}
	System.out.println("\nHere is the box:\n");
	for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				System.out.print("*");
			System.out.println();
		}
		scan.close();
	}
}

/* ==== OUTPUT =====================================================================
The box cannot be more than 60 stars wide and 10 stars high.
The number of rows and columns must be greater than zero.
Enter the number of rows: 9
Enter the number of columns: 70




The box cannot be more than 60 stars wide and 10 stars high.
The number of rows and columns must be greater than zero.
Enter the number of rows: 10
Enter the number of columns: 45

Here is the box:

*********************************************
*********************************************
*********************************************
*********************************************
*********************************************
*********************************************
*********************************************
*********************************************
*********************************************
*********************************************
==================================================================================*/

/* ==== OUTPUT =====================================================================
The box cannot be more than 60 stars wide and 10 stars high.
The number of rows and columns must be greater than zero.
Enter the number of rows: 15
Enter the number of columns: 45




The box cannot be more than 60 stars wide and 10 stars high.
The number of rows and columns must be greater than zero.
Enter the number of rows: 4
Enter the number of columns: 7

Here is the box:

*******
*******
*******
*******
==================================================================================*/

