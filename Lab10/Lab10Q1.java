import java.util.Scanner;
public class Lab10Q1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter a number:");
		double num = cin.nextDouble();
		cin.close();
		System.out.println(timesTen(num));
	}
	public static double timesTen(double num) {
		return num * 10;
	}
}
