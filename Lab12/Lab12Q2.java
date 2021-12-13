public class Lab12Q2 {
	public static void main(String [] args) {
		// create and init the test array
		int[] numbers = new int[6];
		numbers[0] = 12;
		numbers[1] = 54;
		numbers[2] = 65;
		numbers[3] = 86;
		numbers[4] = 23;
		numbers[5] = 59;
		System.out.printf("The max value is %d.", arraymax(numbers));
	}
	public static int arraymax(int[] numbers) {
		int max = 0;
		// determine the max value of the array
		for(int i = 0; i < numbers.length; i++) {
			if(i == 0)
				max = numbers[i];
			else {
				if(numbers[i] > max)
					max = numbers[i];
			}
		}
		return max;
	}
}
