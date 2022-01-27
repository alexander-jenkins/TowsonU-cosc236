import java.util.Scanner;
public class Lab12Q3 {
	public static void main(String[] args) {
		// create the array input
		Scanner cin = new Scanner(System.in);
		// create and init the arrays
		int[] arr1 = new int[4];
		int[] arr2 = new int[4];
		System.out.println("Please input 4 integer values.");
		for(int i = 0; i < arr1.length; i++)
			arr1[i] = cin.nextInt();
		System.out.println("Please input another 4 integer values.");
		for(int i = 0; i < arr2.length; i++)
			arr2[i] = cin.nextInt();
		cin.close();
		// determine if the loops are the same
		int flag = 0;
		for(int i = 0; i < 4; i++) {
			if(arr1[i] != arr2[i])
				flag = 1;
		}
		if(flag == 0)
			System.out.println("These arrays are the same.");
		else
			System.out.println("These arrays are different.");
	}
}