
public class Cities {

	public static void main(String[] args) {
		String[] cities = {"Norco", "Brea", "Anaheim", "Riverside", "Corona"};
		
		System.out.println("Here are the cities:");
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);	
		}
		System.out.println("\nHere are the cities in reverse order:");
		for (int i = cities.length - 1; i >= 0; i--) {
			System.out.println(cities[i]);
		}
	}
}
