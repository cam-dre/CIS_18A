import java.util.Scanner;
public class MuseumClient {
	public static void main(String[] args) {
		final int SIZE = 3;
		Museum[] museums = new Museum[SIZE];
		Scanner scan = new Scanner(System.in);
		String name;
		String city;
		String desc;
		
		System.out.println("Enter " + SIZE + " museums.");
		for (int i = 0; i < SIZE; i++) {
			museums[i] = new Museum();
			
			System.out.println("#" + (i + 1));
			System.out.print("Name: ");
			name = scan.nextLine();
			System.out.print("City: ");
			city = scan.nextLine();
			System.out.print("Desc: ");
			desc = scan.nextLine();
			museums[i].setInfo(name, city, desc);
			System.out.println();
		}
		for (int i = 0; i < SIZE; i++) {
			System.out.println("#" + (i + 1));
			System.out.print(museums[i] + "\n\n");
		}
		scan.close();
	}
}
