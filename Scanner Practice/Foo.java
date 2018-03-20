import java.util.Scanner;

public class Foo {
	public static void main(String[] args) {
		String first;
		//String strInitial ;
		String last;
		char initial;
		int age;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name:  ");
		
		first = scan.next();
		
		System.out.println("Enter your middle initial:  ");
		
		//strInitial = scan.next();
		//initial = strInitial.charAt(0);
		
		initial = scan.next().charAt(0);
		
		System.out.println("Enter you last name:  ");

		last = scan.next();
		
		System.out.println("Enter your age:  ");
		
		age = scan.nextInt();
		
		System.out.println(first + " " + initial + ". " + last + " is " + age + " years old.");
		
		scan.close();
	}

}
