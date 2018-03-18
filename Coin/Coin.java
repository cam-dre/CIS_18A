public class Coin {
	private String name;
	private String country;
	private String desc;
	private static int numCoins = 0;
	
	public Coin(){
		numCoins++;
	}
	public Coin(String name, String country, String desc) {
		this.name = name;
		this.country = country;
		this.desc = desc;
		numCoins++;
	}
	public static int getNumCoins() {
		return numCoins;
	}
	public String toString() {
		return "Name: " + name + "\nCountry: " + country + "\nDescrption: " + desc + "\n";
	}
}