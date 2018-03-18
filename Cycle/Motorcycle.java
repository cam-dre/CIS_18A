public class Motorcycle extends Cycle {
	private String motorType;
	
	public Motorcycle(String motorType, int numWheels, String mfr) {
		super(numWheels, mfr);
		this.motorType = motorType;
	}
	public String toString() {
		return "Motorcycle\nMotor Type: " + motorType + "\nNumber of Wheels: " + numWheels + "\nManufacturer: " + mfr + "\n";
	}
}