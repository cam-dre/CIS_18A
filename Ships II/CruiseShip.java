public class CruiseShip extends Ship {
	private int passengers;
	
	public CruiseShip(String name, String yearBuilt, int passengers) {
		super(name, yearBuilt);
		this.passengers = passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	public int getPassengers() {
		return passengers;
	}
	public String toString() {
		return "Name: " + getName() + "\nYear built: " + getYearBuilt() + "\nMaximum passengers: " + passengers; 
	}
}
