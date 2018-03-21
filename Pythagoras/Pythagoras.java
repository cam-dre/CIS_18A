import java.util.Scanner;
public class Pythagoras {
	public static void main(String[] args) {
		double sideA;
		double sideB;
		double sideC;
		
		System.out.print("Enter side A: ");
		sideA = getSide();
		
		System.out.print("Enter side B: ");
		sideB = getSide();
		
		sideC = calcSideC(sideA, sideB);
		displaySideC(sideC);
	}
	public static double getSide() {
		double side;
		Scanner scan = new Scanner(System.in);
		side = scan.nextDouble();
		scan.close();
		return side;
	}
	public static double calcSideC(double sideA, double sideB) {
		double cSquared = Math.pow(sideA, 2) + Math.pow(sideB, 2);
		return Math.sqrt(cSquared);
	}
	public static void displaySideC(double sideC) {
		System.out.println("Side C is " + sideC);
	}
}
