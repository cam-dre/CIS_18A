public class Museum {
	private String name;
	private String city;
	private String desc;
	
	public Museum() {
		name = "";
		city = "";
		desc = "";
	}
	public Museum(String name, String city, String desc) {
		this.name = name;
		this.city = city;
		this.desc = desc;
	}
	public void setInfo(String name, String city, String desc) {
		this.name = name;
		this.city = city;
		this.desc = desc;
	}
	public String toString() {
		return "Name: " + name + "\nCity: "+ city + "\nDesc: " + desc;
	}

}
