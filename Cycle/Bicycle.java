public class Bicycle extends Cycle {
	private int numGears;
	
	public Bicycle(int numGears, int numWheels, String mfr) {
		super(numWheels, mfr);
		this.numGears = numGears;
	}
	public String toString() {
		return "Bicycle\nNumber of Gears: " + numGears + "\nNumber of Wheels: " + numWheels + "\nManufacturer: " + mfr + "\n";
	}
}