public class NumbersArray {
	public static void main(String[] args) {
		final int SIZE = 5;
		int[] numbers = {2, 4, 5, 6, 8};
		int[] values = {2, 4, 5, 6, 9};
		
		if (areSame(numbers, values, SIZE))
			System.out.println("The arrays are the same.");
		else
			System.out.println("The arrays are not the same");
	}
	public static boolean areSame(int[] numbers, int[] values, int size) {
		for (int i = 0; i < size; i++ ) {
			if (numbers[i] != values[i])
				return false;	
		}
		return true;
	}
}
