
public abstract class Vehicle {
	private static int vehicleCount = 0;
	 
	public Vehicle() {
		vehicleCount++;
	}
	public abstract void setType(String type);
	public abstract String getType();
	public static int getCount() {
		return vehicleCount;
	}
}
