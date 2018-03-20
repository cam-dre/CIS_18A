import java.util.Scanner;

public class DoorPrize {
	public static void main(String[] args) {
		int door;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Pick a door, 1 or 2: ");
		door = scan.nextInt();
		
		System.out.println("You entered " + door);
		System.out.println("You have chosen the " + (door == 2? "Correct" : "Wrong") + " door!");
		scan.close();
	}
}
