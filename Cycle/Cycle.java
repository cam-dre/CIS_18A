public class Cycle {
	protected String mfr;
	protected int numWheels;
	
	public Cycle(int numWheels, String mfr) {
		this.numWheels = numWheels;
		this.mfr = mfr;
	}
	public static void main(String[] args) {
		Bicycle bike_1 = new Bicycle(10, 2, "Schwinn");
		Motorcycle bike_2 = new Motorcycle("2-stroke", 2, "Harley Davidson" );
		
		System.out.println(bike_1);
		System.out.println(bike_2);
	}
}