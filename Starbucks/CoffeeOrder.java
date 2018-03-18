public class CoffeeOrder {
	private String name;
	private double pricePerOz; 
	private int ounces;
	
	public CoffeeOrder() {}
	public CoffeeOrder(String name, double pricePerOz, int ounces) {
		this.name = name;
		this.pricePerOz = pricePerOz;
		this.ounces = ounces;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double pricePerOz) {
		this.pricePerOz = pricePerOz;
	}
	public void setOunces(int ounces) {
		this.ounces = ounces;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return pricePerOz;
	}
	public int getOunces() {
		return ounces;
	}
	public double calcCost() {
		return pricePerOz * (double) ounces;
	}
}