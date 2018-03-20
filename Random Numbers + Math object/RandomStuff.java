import java.util.Random;
import java.text.DecimalFormat;

public class RandomStuff {
	public static void main(String[] args) {
		Random random = new Random();
		DecimalFormat commas = new DecimalFormat("###,###");
		
		System.out.println("Here are 10 random numbers:");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\t" + commas.format(random.nextInt()));
		}
		
		System.out.println("\nHere are 10 random numbers:");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\t" + commas.format(Math.random() * 1000));
		}

	}

}
