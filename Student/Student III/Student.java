import java.text.DecimalFormat;

public class Student {
	private String name;
	private String ssn;
	private double gpa;
	private static int studentCount = 0;
	
	public Student() {
		studentCount++;
	}
	public Student(String name, String ssn, double gpa) {
		this.name = name;
		this.ssn = ssn;
		this.gpa = gpa;
		studentCount++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		// gpa must be between 0.0 and 4.0 or method will display a runtime error
		if (gpa > 0.0 && gpa <= 4.0)
			this.gpa = gpa;
		else {
			System.err.println("Gpa must be between 0.0 and 4.0.");
			System.err.println("Value not changed.\n");
		}
	}
	public static int getCount() {
		return studentCount;
	}
	public String toString() {
		DecimalFormat oneDigit = new DecimalFormat("0.0");
		return "Name: " + name + "; SSN: " + ssn + "; GPA: " + oneDigit.format(gpa)
				+ "\n";
	}
}
