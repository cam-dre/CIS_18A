import javax.swing.JOptionPane;

public class Alcohol {
	public static void main(String[] args) {
		String strAge;
		int age;
		
		strAge = JOptionPane.showInputDialog(null, "Enter your age:", "Input");
		age = Integer.parseInt(strAge);
		
		if (age > 21) {
			JOptionPane.showMessageDialog(null, "You can drink", "Results", JOptionPane.PLAIN_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(null, "Not Today", "Results", JOptionPane.PLAIN_MESSAGE);

	}

}
