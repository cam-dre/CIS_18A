public abstract class Toy {
	protected String sku;
	protected String name;
	protected static int count = 0;
	
	public Toy(String sku, String name) {
		this.sku = sku;
		this.name = name;
		count++;
	}
	public static int getCount() {
		return count;
	}
	public abstract String toString();
	public static void main(String[] args) {
		Doll toy_1 = new Doll("12345", "Cabbage Patch Kids", "Plastic");
		Game toy_2 = new Game("54321", "Skyrim", "MA");
		Game toy_3 = new Game("6789", "Call of Duty", "MA");
		
		System.out.println(toy_1 + "\n" + toy_2 + "\n" + toy_3);
		System.out.println("There are " + Toy.getCount() + " toys.");
	}
}