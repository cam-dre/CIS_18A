
public class StudentClient {
	public static void main(String[] args) {
		int id = 12345;
		String name = "Tom Lee";
		
		Student student = new Student();
		Student anotherOne = new Student();
		Student third = new Student(55555, "John Lee");
		
		System.out.println("Student #1:" );
		student.shoStudent();
		
		System.out.println("Student #2:");
		anotherOne.shoStudent();
		
		System.out.println("Student #3:");
		third.shoStudent();
		
		student.setID(id);
		student.setName(name);
		student.shoStudent();
		
		anotherOne.setID(3333);
		anotherOne.setName("Bruce Lee");
		anotherOne.shoStudent();
		
		System.out.println("Student #" + student.getID() + " name is " + student.getName() +".\n");
		System.out.println("Student #" + anotherOne.getID() + " name is " + anotherOne.getName() +".\n");
		System.out.println("Student #" + third.getID() + " name is " + third.getName() +".\n");
	}
}
