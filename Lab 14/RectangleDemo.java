/*
 * Alex Jenkins
 * 5/17/2020
*/
import java.util.Scanner;
public class RectangleDemo {
	public static void main(String[] args) {
		// create the object
		Rectangle box = new Rectangle();
		// create the scanner
		Scanner cin = new Scanner(System.in);
		// set the fields
		System.out.println("What is the width of the rectangle?");
		box.setWidth(cin.nextInt());
		System.out.println("What is the height of the rectangle?");
		box.setHeight(cin.nextInt());
		cin.close();
		// output the fields
		System.out.println("The width is " + box.getWidth() + ".");
		System.out.println("The height is " + box.getHeight() + ".");
		System.out.println("The area is " + box.getArea() + ".");
	}
}
