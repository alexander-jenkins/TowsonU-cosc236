public class Lab11Q3 {
	public static void main(String[] args) {
		// create the array and init all values
		Double[] numbers = new Double[5];
		numbers[0] = 213.0;
		numbers[1] = 75.0;
		numbers[2] = 89.0;
		numbers[3] = 3.0;
		numbers[4] = 45.0;
		System.out.printf("The average of the values is %.2f", arrayAvg(numbers));
	}
	public static double arrayAvg(Double[] numbers) {
		// calculate the average of the values in the array
		double average = 0;
		double total = 0;
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		average = total / numbers.length;
		return average;
	}
}
