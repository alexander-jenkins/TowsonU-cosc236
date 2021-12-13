public class Lab12Q4 {
	public static void main(String[] args) {
		// create the 2d array
		int[][] data = new int[4][7];
		// init the 3rd row with 1-7
		for(int i = 1; i <= 7; i++)
			data[3][i-1] = i;
		// output the full array
		for(int i = 0; i < 4; i++) {
			for(int k = 0; k < 7; k++)
				System.out.print(data[i][k]);
			System.out.print("\n");
		}
	}
}