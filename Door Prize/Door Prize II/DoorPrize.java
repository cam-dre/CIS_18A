import java.util.Scanner;
public class DoorPrize {
	public static void main(String[] args) {
		int door = 2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick a door, 1 or 2: ");
		door = scan.nextInt();
		
		System.out.println("You entered " + door);
		
		// left true && right false
		System.out.println("You have chosen the " + (door == 2? "correct " : "wrong ") + "door!");
		scan.close();
	}
}
