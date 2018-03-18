// =================================================================================
// File: Extra Credit
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
import java.util.ArrayList;
import java.util.Iterator;

public class StudentClient {
	public static void main(String[] args) {
		// Create Student objects
		Student s1 = new Student(1000, "Kim", 19);
		Student s2 = new Student(1001, "Bob", 22);
		Student s3 = new Student(1002, "Joe", 21);
		
		// Create array list
		ArrayList<Student> list = new ArrayList<Student>();
		
		// Put the Student objects in the list
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		// Assign the iterator to the beginning of the list
		Iterator it = list.iterator();
		
		// Traverse the list elements
		while (it.hasNext()) {
			Student student =  (Student)it.next();
			System.out.println(student.getNumber() + " " + student.getName() 
					+ " " + student.getAge());
		}
	}
}

/* ==== OUTPUT =====================================================================
1000 Kim 19
1001 Bob 22
1002 Joe 21
==================================================================================*/