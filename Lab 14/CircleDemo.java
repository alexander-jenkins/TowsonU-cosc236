/*
 * Alex Jenkins
 * 5/17/2020
*/
import java.util.Scanner;
public class CircleDemo {
	public static void main(String[] args) {
		// create the object
		Circle circle = new Circle();
		// create the scanner
		Scanner cin = new Scanner(System.in);
		// set the fields
		System.out.println("What is the radius of the circle?");
		circle.setRadius(cin.nextDouble());
		cin.close();
		// output the fields
		System.out.println("The radius is " + circle.getRadius() + ".");
		System.out.println("The area is " + circle.getArea() + ".");
	}
}
