public class Lab11Q2 {
	public static void main(String[] args) {
		Double[] tScore = new Double[5];
		tScore[0] = 70.0;
		tScore[1] = 60.0;
		tScore[2] = 30.0;
		tScore[3] = 100.0;
		tScore[4] = 40.0;
		double average, total = 0, lowest = 0, highest = 0;
		for(int i = 0; i < tScore.length; i++) {
			if(i == 0) {
				lowest = tScore[i];
				highest = tScore[i];				
			}
			else {
				if(tScore[i] > highest)
					highest = tScore[i];
				if(tScore[i] < lowest)
					lowest = tScore[i];
			}
			total += tScore[i];
		}
		average = total / tScore.length;
		System.out.printf("The average score is %.2f. The lowest score is %.2f and the highest score is %.2f", average, lowest, highest);
	}
}
