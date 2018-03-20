import javax.swing.JOptionPane;
public class Input {
	public static void main(String[] args) {
		String response = JOptionPane.showInputDialog(null, "How do you like your cell phone?");
		System.out.println("So you said:  "+ response);
		
		String age = JOptionPane.showInputDialog(null, "How old are you?  ");
		// This is dope
		int yourAge = Integer.parseInt(age);
		
		yourAge++;
		
		System.out.println("After your birthday, you'll be " + yourAge + " years old.");
		
		JOptionPane.showMessageDialog(null, "Knock, Knock 'Neo...", "I'm watching", JOptionPane.WARNING_MESSAGE);
	}

}
