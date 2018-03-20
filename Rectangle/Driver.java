// =================================================================================
// File: HW_6c - Rectangle
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		// tennisCourt object created
		Rectangle tennisCourt = new Rectangle();
		String strWidth;
		String strLength;
		double width;
		double length;
		
		// String input by user is parsed into a double and then
		// sent to the setLength method
		strLength = JOptionPane.showInputDialog(null, "Enter Length:"); 
		length = Double.parseDouble(strLength);
		tennisCourt.setLength(length);
		
		// String input by user is parsed into a double and then
		// sent to the setWidth method
		strWidth = JOptionPane.showInputDialog(null, "Enter Width:");
		width = Double.parseDouble(strWidth);
		tennisCourt.setWidth(width);
		
		// Width, Length and Area are displayed in a message dialog box
		JOptionPane.showMessageDialog(null, "The area of a rectangle with a length"
				+ " of " + tennisCourt.getLength() + " and a width of "
				+ tennisCourt.getWidth() + " is " + tennisCourt.getArea(),
				"Area", JOptionPane.INFORMATION_MESSAGE);
	}
}
