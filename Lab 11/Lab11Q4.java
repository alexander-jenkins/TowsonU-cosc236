import java.util.Scanner;
public class Lab11Q4 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		// create the array and init all values
		System.out.println("How many days of temperatures do you want to enter? (Enter an integer value)");
		int length = cin.nextInt();
		Double[] temps = new Double[length];
		System.out.println("Please enter the first temperature. (In Farenheit)");
		for(int i = 0; i < temps.length; i++){
			temps[i] = cin.nextDouble();
			if(i != (length - 1))
				System.out.println("Please enter the next temperature.");
		}
		cin.close();
		System.out.printf("The average of the temperatures is %.2f degrees.\n", arrayAvg(temps));
		System.out.printf("%d of them were above average.", aboveAvg(temps, arrayAvg(temps)));
	}
	public static double arrayAvg(Double[] temps) {
		double average = 0;
		double total = 0;
		for(int i = 0; i < temps.length; i++) {
			total += temps[i];
		}
		average = total / temps.length;
		return average;
	}
	public static int aboveAvg(Double[] temps, double average) {
		int aboveAvg = 0;
		for(int i = 0; i < temps.length; i++) {
			if(temps[i] > average) {
				aboveAvg += 1;
			}
		}
		return aboveAvg;
	}
}