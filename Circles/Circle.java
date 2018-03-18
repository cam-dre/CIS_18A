import java.text.DecimalFormat;

public class Circle {
	private double radius;
	private final double PI = 3.14159;
	private static int circleCount = 0;
	
	public Circle() {
		radius = 0.0;
		circleCount++;
	}
	public Circle(double radius) {
		this.radius = radius;
		circleCount++;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return PI * Math.pow(radius, 2);
	}
	public double getDiameter() {
		 
		return radius * 2.0;
	}
	public double getCircumference() {
		return 2.0 * PI * radius;
	}
	public void showCircle() {
		DecimalFormat twoDigits = new DecimalFormat("##0.00");
		System.out.println("Radius: " + twoDigits.format(radius) + "\nArea: " + twoDigits.format(getArea()) + "\nDiameter: "  + twoDigits.format(getDiameter()) + "\nCircumference: " + twoDigits.format(getCircumference()) + "\n");
	}
	public String toString() {
		DecimalFormat twoDigits = new DecimalFormat("##0.00");
		return "Radius: " + twoDigits.format(radius) + "\nArea: " + twoDigits.format(getArea()) + "\nDiameter: "  + twoDigits.format(getDiameter()) + "\nCircumference: " + twoDigits.format(getCircumference()) + "\n";
	}
	public static int getCount() {
		return circleCount;
	}
}
