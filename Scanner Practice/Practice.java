import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		String name;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your full name:  ");
		
		name = scan.nextLine();
		name = name.toUpperCase();
		
		System.out.println("Here it is in upper case:  " + name);
		System.out.println("there are " + name.length() + " charaters.");
		
		scan.close();
	
	}

}
