import java.util.Scanner;
public class Lab10Q3 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter a temperature in Celcius.");
		double centigrade = cin.nextDouble();
		cin.close();
		System.out.printf("%.2f Celcius is %.2f in Farenheit.", centigrade ,farenheit(centigrade));
	}
	public static double farenheit(double centigrade) {
		double farenheit = (9 * centigrade) / 5 + 32;
		return farenheit;
	}
}
