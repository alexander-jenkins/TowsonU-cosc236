/*
 * Alexander Jenkins
 * 5/10/2020
 */
import java.util.Scanner;
import java.util.Arrays;
public class Lab13Q2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter five integer values.");
		int[] data = new int[5];
		for(int i = 0; i < data.length; i++)
			data[i] = cin.nextInt();
		cin.close();
		System.out.printf("Original data[]: %s\n", Arrays.toString(data));
		Arrays.sort(data);
		System.out.printf("Sorted data[]: %s\n", Arrays.toString(data));
	}
}