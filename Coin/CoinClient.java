public class CoinClient {
	public static void main(String[] args) {
		Coin coin_1 = new Coin("Quarter", "U.S.", "Silver coin");
		Coin coin_2 = new Coin("Penny", "U.S.", "Copper coin");
		
		System.out.println("Coin #1:\n" +coin_1 + "\n"
				+ "Coin #2:\n" + coin_2);
		System.out.println("There are " + Coin.getNumCoins() + " coins.");
	}
}