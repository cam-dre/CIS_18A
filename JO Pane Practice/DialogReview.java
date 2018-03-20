import javax.swing.JOptionPane;

public class DialogReview {
	public static void main(String[] args) {
		String strNum1;
		String strNum2;
		int num1;
		int num2;
		int sum;
		
		strNum1 = JOptionPane.showInputDialog(null, "Enter first number:");
		strNum2 = JOptionPane.showInputDialog(null, "Enter first number:");
		
		num1 = Integer.parseInt(strNum1);
		num2 = Integer.parseInt(strNum2);
		
		sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The sum equals " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
		
		

	}

}
