public class CompareStrings {
	public static void main(String[] args) {
		String title1 = "Green Pastures";
		String title2 = "green Pastures";
		
		System.out.print("Using equals: ");
		if (title1.equals(title2))
			System.out.println(title1 + " equals " + title2);
		else
			System.out.println(title1 + " is not equal to " + title2);
		
		System.out.print("Using equalsIgnoreCase: ");
		if (title1.equalsIgnoreCase(title2))
			System.out.println(title1 + " equals " + title2);
		else
			System.out.println(title1 + " is not equal to " + title2);
	}
}
