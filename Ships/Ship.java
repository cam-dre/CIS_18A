public class Ship {
	protected String name;
	protected  String yearBuilt;
	
	public Ship(String name, String yearBuilt) {
		this.name = name;
		this.yearBuilt = yearBuilt;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public String getName() {
		return name;
	}
	public String getYearBuilt() {
		return yearBuilt;
	}
	public String toString() {
		return "Name: " + name + "\nYear built: " + yearBuilt;
	}
}
