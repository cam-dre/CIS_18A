public class CargoShip extends Ship {
	private int tonnage;
	
	public CargoShip(String name, String yearBuilt, int tonnage) {
		super(name, yearBuilt);
		this.tonnage = tonnage;
	}
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	public int getTonnage() {
		return tonnage;
	}
	public String toString() {
		return "Name: " + getName() + "\nYear built: " + getYearBuilt() + "\nCargo capacity: " + tonnage + " tons";
	}
}
