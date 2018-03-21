import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		int num;
		String name;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Get number: ");
		num = scan.nextInt();
		
		System.out.print("Get name: ");
		name = scan.nextLine();
		
		System.out.println(name + " is " + num + "years old.");
		scan.close();
		
		

	}

}
