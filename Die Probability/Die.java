import java.util.Random;
public class Die {
	public final int SIDES = 6;
	private Random rand;
	
	public Die() {
		rand = new Random();
	}
	public int roll() {
		return rand.nextInt(SIDES) + 1;
	}
}