public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle() {
		width = 0.0;
		length = 0.0;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double getArea() {
		return length * width;
	}
}
