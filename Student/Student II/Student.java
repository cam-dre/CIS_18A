
public class Student {
	// instance variables
	private int id;
	private String name;
	
	// default constructor - No parameters
	public Student() {
		id = 0;
		name = "";
	}
	// overloaded constructor
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public void setID(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void shoStudent() {
		System.out.println("ID: " + id + "\nName: " + name + "\n");
	}
}
