

public class EmployeeClient {

	public static void main(String[] args) {
		Employee employee = new Employee(12345, 3500);
		//employee.displaySalary();
		System.out.println(employee);
		
		employee.setEmployee(54321, 3500 * 2);
		//employee.displaySalary();
		System.out.println(employee);

	}

}
