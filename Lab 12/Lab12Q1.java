public class Lab12Q1 {
	public static void main(String [] args) {
		// create and init the test array
		int[] numbers = new int[6];
		numbers[0] = 12;
		numbers[1] = 54;
		numbers[2] = 65;
		numbers[3] = 86;
		numbers[4] = 23;
		numbers[5] = 59;
		System.out.printf("The min value is %d.", arrayMin(numbers));
	}
	public static int arrayMin(int[] numbers) {
		int min = 0;
		// determine the min value of the array
		for(int i = 0; i < numbers.length; i++) {
			if(i == 0)
				min = numbers[i];
			else {
				if(numbers[i] < min)
					min = numbers[i];
			}
		}
		return min;
	}
}
