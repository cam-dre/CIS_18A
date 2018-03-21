import java.util.Random;
public class RandomNumbers {
	public static void main(String[] args) {
		int die;
		
		Random random = new Random();
		// Generate a random number between 1 and 6.
		// The method below generates a random between 0 and 5,
		// then 1 is added to the result, so the random number is between 1 and 6.
		die = random.nextInt(6) + 1;
		System.out.println("\nThe die roll is " + die);
		
		// Generate a random number between 20 and 200.
		int start = 20;
		int end = 200;
		int number = random.nextInt(end - start + 1 ) + start;
		System.out.println("\nThe random number between " + start + " and " + end + " is " + number);
	}
}
