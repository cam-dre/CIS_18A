import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		int age;
		String name;
		
		
		age = getAge();
		name = getName();
		displayInfo(age, name);
	}
	public static int getAge() {
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age:  ");
		age = scan.nextInt();
		scan.close();
		return age;
		
	}
	public static String getName() {
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name:  ");
		name = scan.nextLine();
		scan.close();
		return name;
	}
	public static void displayInfo(int age, String name) {
		System.out.println(name + " is " + age + " years old.\n");
	}
}

