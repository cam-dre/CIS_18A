public class Game extends Toy{
	private String esrbRating;
	
	public Game(String sku, String name, String esrbRating) {
		super(sku, name);
		this.esrbRating = esrbRating;
	}
	public String toString() {
		return "Game\nSKU #: " + sku + "\nName: " + name + "\nESRB Rating: " + esrbRating + "\n";
	}
}