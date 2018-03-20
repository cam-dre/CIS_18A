public class Money {
	public static void main(String[] args) {
		final int PENNIES_PER_QUARTER = 25;
		int pennies = 113;
		int quarters = pennies / PENNIES_PER_QUARTER;
		int remainder = pennies % PENNIES_PER_QUARTER;
		
		System.out.println("There are " + quarters + " quarters in " + pennies + " pennies.");
		System.out.println("There are " + remainder + " left over.");
	}
}
