import java.util.Scanner;
public class Lab10Q4 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("This function requires a time and speed and will calculate the distance traveled in meteres.");
		System.out.println("Please enter a positive number for speed:");
		double speed = cin.nextDouble();
        while(speed < 0){
            System.out.println("Invalid input, please enter a positive number for speed:");
            speed = cin.nextDouble();
        }
        System.out.println("Please enter the amount of time in seconds the object has traveled:");
        double time = cin.nextDouble();
		while(time < 0){
            System.out.println("Invalid input, please enter a number of at least 0 for time:");
            time = cin.nextDouble();
        }
		cin.close();
		System.out.printf("The object has traveled %.2f meters.", distance(speed, time));
	}
	public static double distance(double speed, double time) {
		double distance = speed * time;
		return distance;
	}
}
