/*
 * Alex Jenkins
 * 5/17/2020
*/
public class Circle {
	// fields
	private double radius;
	private final double pi = 3.14159;
	// methods
	public void setRadius(double rad) {
		radius = rad;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return pi * radius * radius;
	}
}
