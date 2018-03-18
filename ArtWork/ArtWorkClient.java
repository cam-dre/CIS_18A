import java.util.Scanner;

public class ArtWorkClient {

	public static void main(String[] args) {
		final int SIZE = 4;
		String title;
		String artist;
		int year;
		ArtWork[] paintings = new ArtWork[SIZE];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter " + SIZE + " paintings." );
		for (int i = 0; i < SIZE; i++) {
			
			paintings[i] = new ArtWork();
			
			System.out.println("#" + (i + 1) + ": ");
			System.out.print("Title: ");
			title = scan.nextLine();
			System.out.print("Artist: ");
			artist = scan.nextLine();
			System.out.print("Year: ");
			year = scan.nextInt();
			scan.nextLine();
			
			paintings[i].setInfo(title,artist,year);
		}
		
		
		System.out.println("Here is the list of art work:");
		for (int i = 0; i < SIZE; i++) {
			System.out.println(paintings[i]);
		}
		scan.close();
	}
}
