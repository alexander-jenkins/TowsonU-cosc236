import java.util.Scanner;
public class Lab10Q2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter your object's falling time in seconds.");
		double t = cin.nextDouble();
		cin.close();
		System.out.printf("The object has fallen %.2f meters.", fallingDistance(t));
	}
	public static double fallingDistance(double t) {
		double h;
		final double g = 9.8;
		h = (g * t * t)/2;
		return h;
	}
}
