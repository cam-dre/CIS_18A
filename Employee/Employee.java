import java.text.DecimalFormat;

public class Employee {
	private String department;
	private double salary;
	
	public Employee() {
		department = "";
		salary = 0.0;
	}
	public Employee(String department, double salary) {
		this.department = department;
		this.salary = salary;
	}
	public void setPosition(String department) {
		this.department = department;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		DecimalFormat twoDigits = new DecimalFormat("$###,##0.00");
		return "Position: " + department + "\nSalary: "
				+ twoDigits.format(salary) + "\n";
	}
}
