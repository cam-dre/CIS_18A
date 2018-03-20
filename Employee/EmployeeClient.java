// =================================================================================
// File: HW_6b - Employees
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
import javax.swing.JOptionPane;

public class EmployeeClient {

	public static void main(String[] args) {
		// Three Employee objects are created
		Employee emp_1 = new Employee();
		Employee emp_2 = new Employee("Management", 120000);
		Employee emp_3 = new Employee("Sales", 80000);
		String position;
		String strSalary;
		double salary;
		
		// All three employees are displayed in message dialog box
		JOptionPane.showMessageDialog(null, "Here are 3 employees:\n" + emp_1
				+ emp_2 + emp_3, "Employees", JOptionPane.PLAIN_MESSAGE);
		// String input by user is sent to the setPosition method
		position = JOptionPane.showInputDialog(null, "Set Emp #1\nPosition:");
		emp_1.setPosition(position);
		// String input by user is parsed into a double and sent
		// to the setSalary method
		strSalary = JOptionPane.showInputDialog(null, "Set Emp #1\nSalary:");
		salary = Double.parseDouble(strSalary);
		emp_1.setSalary(salary);
		// Employee #1 is output in a message dialog box
		JOptionPane.showMessageDialog(null, "Here is Employee #1:\n" + emp_1,
				"Employees", JOptionPane.PLAIN_MESSAGE);
	}
}
