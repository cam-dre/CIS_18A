import java.text.DecimalFormat;

public class Employee {
	private int id;
	private double salary;
	
	public Employee(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}
	public void setEmployee(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}
	/*public void displaySalary() {
		DecimalFormat twoDigits = new DecimalFormat("$###.00");
		System.out.println("Employee: #" + id + "\nSalary: " + twoDigits.format(salary));
	}*/
	public String toString() {
		DecimalFormat twoDigits = new DecimalFormat("$###.00");
		return "ID: " + id + "\nSalary: " + twoDigits.format(salary);
	}
}
