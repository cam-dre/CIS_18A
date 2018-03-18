// =================================================================================
// File: HW_5b - DoTheMath_B
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class DoTheMath_B {
	public static void main(String[] args) {
		double num1;
		double num2;
		double result;
		int selection;
		
		// num1 is assigned a value by user
		num1 = getFirstNumber();
		// num2 is assighed a value by user
		num2 = getSecondNumber();
		// Math menu is output to screen
		showMenu();
		// user makes a selection from math menu
		selection = getSelection();
		// result is found based on selection made by user
		result = doTheMath(num1, num2, selection);
		// result is displayed
		displayResult(num1, num2, result, selection);
	}
	public static double getFirstNumber() {
		String strNum;
		double num;
		
		strNum = JOptionPane.showInputDialog(null, "Enter the first number");
		num = Double.parseDouble(strNum);
		return num;
	}
	public static double getSecondNumber() {
		String strNum;
		double num;
		
		strNum = JOptionPane.showInputDialog(null, "Enter the second number"
				+ " - (Cannot be zero)");
		num = Double.parseDouble(strNum);
		
		// this code repeats while the second number is equal to zero
		while (num == 0) {
			strNum = JOptionPane.showInputDialog(null, "Second number cannot be zero!"
					+ "\nEnter the second number - (Cannot be zero): ");
			num = Double.parseDouble(strNum);
		}
		return num;
	}
	public static void showMenu() {
		JOptionPane.showMessageDialog(null, "1. Addition\n2. Subtraction"
				+ "\n3. Multiply\n4. Divide", "Menu", JOptionPane.PLAIN_MESSAGE);
	}
	public static int getSelection() {
		String strSelection;
		int selection;
		
		strSelection = JOptionPane.showInputDialog(null, "Which math operation?"
				+ " Enter your choice");
		selection = Integer.parseInt(strSelection);
		
		// this code will loop as long as a number from 1-4 is not chosen
		while (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
			
			strSelection = JOptionPane.showInputDialog(null, "Invalid Entry!"
					+ "\nWhich math operation? Enter your choice");
			selection = Integer.parseInt(strSelection);
		}
		return selection;
	}
	public static double doTheMath(double num1, double num2, int selection) {
		double result = 0;
		switch (selection) {
		case 1: result = num1 + num2;
			break;
		case 2: result = num1 - num2;
			break;
		case 3: result = num1 * num2;
			break;
		case 4: result = num1 / num2;
			break;
		}
		return result;
	}
	public static void displayResult(double num1, double num2, double result, int selection) {
		DecimalFormat oneDigit = new DecimalFormat("#.0");
		
		switch (selection) {
		case 1: JOptionPane.showMessageDialog(null, oneDigit.format(num1) + " + "
				+ oneDigit.format(num2) + " = " + oneDigit.format(result),
				"Result", JOptionPane.PLAIN_MESSAGE);
			break;
		case 2: JOptionPane.showMessageDialog(null, oneDigit.format(num1) + " - "
				+ oneDigit.format(num2) + " = " + oneDigit.format(result),
				"Result", JOptionPane.PLAIN_MESSAGE);
			break;
		case 3: JOptionPane.showMessageDialog(null, oneDigit.format(num1) + " * "
				+ oneDigit.format(num2) + " = " + oneDigit.format(result),
				"Result", JOptionPane.PLAIN_MESSAGE);
			break;
		case 4: JOptionPane.showMessageDialog(null, oneDigit.format(num1) + " / "
				+ oneDigit.format(num2) + " = " + oneDigit.format(result),
				"Result", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
