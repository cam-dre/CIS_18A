import java.text.DecimalFormat;
public class StarbucksClient {
	public static void main(String[] args) {
		CoffeeOrder[] orders = new CoffeeOrder[5];
		DecimalFormat twoDigits = new DecimalFormat("$###.00");
		
		orders[0] = new CoffeeOrder("Sumatra", .25, 12);
		orders[1] = new CoffeeOrder("Kona", .20, 16);
		
		System.out.println(orders[0].getName() + " costs " + twoDigits.format(orders[0].getPrice()) + " per Oz.\n"
				+ orders[0].getOunces() + " Oz will cost " + twoDigits.format(orders[0].calcCost()) + " per cup\n");
		
		System.out.println(orders[1].getName() + " costs " + twoDigits.format(orders[1].getPrice()) + " per Oz.\n"
				+ orders[1].getOunces() + " Oz will cost " + twoDigits.format(orders[1].calcCost()) + " per cup");
	}
}