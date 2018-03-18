import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
			ArrayList<String> cities = new ArrayList<String>(10);
			
			System.out.println("\nSize = " + cities.size() + "\n");
			// Add elements to the array list
			cities.add("New York");
			cities.add("Paris");
			cities.add("Venice");
			cities.add("Montreal");
			cities.add("Stockholm");
			
			// Displaying the list of array elements
			System.out.println("Here is the list of cities:\n" + cities);
			
			// Add a city at index [0]
			cities.add(0, "Seattle");
			
			// Add a city at the end of the list
			cities.add("London");
			System.out.println("\nThe list after adding Seattle at the"
					+ "beginning and London at the end:\n" + cities);
			
			// Remove a city from the list
			cities.remove("Montreal");
			System.out.println("\nList after removing Montreal:\n" + cities);
			
			if (cities.contains("Montreal"))
				System.out.println("Montreal is in the list.");
			else
				System.out.println("Montreal has been removed.");
			
			// Remove the third item in the list ([2])
			cities.remove(2);
			
			System.out.println("\nAfter third one is removed:\n" + cities);
			System.out.println("\nSize = " + cities.size());
			
			if (cities.contains("New York"))
				System.out.println("New York is in the list.");
			else
				System.out.println("New York has been removed.");
			
			cities.clear();
			System.out.println("\nSize = " + cities.size());
			
	}
}
