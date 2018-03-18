import java.util.ArrayList;

public class NumbersArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++)
			numbers.add(i);
		
		System.out.println("\nThe list using a for loop and get(): ");
		for (int i = 0; i < 5; i ++)
			System.out.print(numbers.get(i) + "\t");
		
		System.out.println("\n\nList displaying the object's contents:");
		System.out.println(numbers);
		
		System.out.println("\nList using a for-each loop:");
		for (Integer obj : numbers)
			System.out.print(obj + "\t");
	}

}
