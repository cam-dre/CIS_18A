import java.util.Scanner;
//import java.text.DecimalFormat;

public class CircleClient {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the radius of a circle: ");
		
		Circle c = new Circle(scan.nextDouble());
		Circle d = new Circle();
		Circle e = new Circle(5);
		Circle f = new Circle();
		Circle g = new Circle(7);
		
		System.out.println("There are " + Circle.getCount() + " circle objects.");
		scan.close();
		
		
	}
}

/*public class CircleClient {
	public static void main(String[] args) {
		// circle object is created and initialized with no value
		Circle userCircle = new Circle();
		Circle anotherCircle = new Circle();
		Scanner scan = new Scanner(System.in);
		DecimalFormat twoDigit = new DecimalFormat("##0.00");
		
		System.out.print("Enter the radius: ");
		userCircle.setRadius(scan.nextDouble());
		
		System.out.println("\nHere is userCircle:\n");
		System.out.println("The Area is: " + twoDigit.format(userCircle.getArea())) ;
		System.out.println("The Diameter is " + twoDigit.format(userCircle.getDiameter()));
		System.out.println("The Circumference is: " + twoDigit.format(userCircle.getCircumference()) + ".\n");
		
		System.out.print("Enter the radius: ");
		anotherCircle.setRadius(scan.nextDouble());
		
		System.out.println("\nHere is anotherCircle:\n");
		System.out.println("The Area is: " + twoDigit.format(anotherCircle.getArea())) ;
		System.out.println("The Diameter is " + twoDigit.format(anotherCircle.getDiameter()));
		System.out.println("The Circumference is: " + twoDigit.format(anotherCircle.getCircumference()) + ".\n");
		scan.close();
		
		//userCircle.showCircle();
		//anotherCircle.showCircle();
		
		System.out.println(userCircle);
		System.out.println(anotherCircle);
		System.out.println("There are " + Circle.getCount() + " circles.");
	}
}*/