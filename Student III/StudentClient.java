// =================================================================================
// Attached: HW_6a, 6b, 6c
// =================================================================================
// File: HW_6a - Students
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
public class StudentClient {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Smith", "123-45-6789", 3.2);
		Student s3 = new Student("Jones", "987-65-4321", 3.7);
		
		System.out.println("Default constructor was used for student #1.");
		// toString method used to display student_1
		System.out.println("Student #1 is " + s1);
		
		// getSsn method used to get the ssn for student_1
		System.out.println("The social securtiy number of student #1 is " + s1.getSsn() + "\n");
		
		// toString method used to display student_2
		System.out.println("Student #2 is " + s2);
		
		// getName method used to get the name of student_3
		System.out.println("The name of student #3 is " + s3.getName());
		
		// getSsn method used to get the ssn for student_3
		System.out.println("The social securtiy number of student #3 is " + s3.getSsn());
		
		// getGpa method used to get the gpa of student_3
		System.out.println("The gpa of student #3 is " + s3.getGpa());
		
		// toString method used to display student_3
		System.out.println("Student #3 is " + s3);
		
		System.out.print("Now set the gpa of Student #2 to 5.0:\n");
		// setGpa method used to change the gpa for student_2
		s2.setGpa(5.0);
		
		// toString method used to display student_2
		System.out.println("Student #2 is " + s2);
		
		// getCount method used to return the number of students 
		System.out.println("There are " + Student.getCount() + " students.");
	}
}

/* ==== OUTPUT =====================================================================
Default constructor was used for student #1.
Student #1 is Name: null; SSN: null; GPA: 0.0

The social securtiy number of student #1 is null

Student #2 is Name: Smith; SSN: 123-45-6789; GPA: 3.2

The name of student #3 is Jones
The social securtiy number of student #3 is 987-65-4321
The gpa of student #3 is 3.7
Student #3 is Name: Jones; SSN: 987-65-4321; GPA: 3.7

Now set the gpa of Student #2 to 5.0:
Student #2 is Name: Smith; SSN: 123-45-6789; GPA: 3.2

There are 3 students.
Gpa must be between 0.0 and 4.0.
Value not changed.
====================================================================================*/
