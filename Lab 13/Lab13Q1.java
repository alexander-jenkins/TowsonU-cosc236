/*
 * Alexander Jenkins
 * 5/10/2020
 */
import java.util.Scanner;
public class Lab13Q1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		// create the array and initialize the values -- this is an array literal
		int[] numbers = new int[]{10, 89, 50, 24, 60, 1, 15};
		System.out.println("Please enter a number to search for.");
		int flag = cin.nextInt();
		cin.close();
		int found = 0;
		// search the array
		for(int i = 0; i < numbers.length; i++) {
			if(flag == numbers[i]) {
				System.out.printf("Your number is found at position %d.", i);
				found = 1;
				break;
				}
		}
		if(found == 0)
			System.out.println("Your number was not found in this array.");
	}
}
