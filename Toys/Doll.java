public class Doll extends Toy {
	private String material;
	
	public Doll(String sku, String name, String material) {
		super(sku, name);
		this.material = material;
	}
	public String toString() {
		return "Doll\nSKU #: " + sku + "\nName: " + name + "\nMaterial: " + material + "\n";
	}
}