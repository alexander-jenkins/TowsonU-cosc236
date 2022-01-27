/*
 * Alex Jenkins
 * 3/10/20
 */
import java.util.Scanner;
public class Lab6Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double distance, speed, time, i = 1;
        // input validation
        System.out.println("Please enter a positive number for speed:");
        speed = sc.nextDouble();
        while(speed < 0){
            System.out.println("Invalid input, please enter a positive number for speed:");
            speed = sc.nextDouble();
        }
        System.out.println("Please enter a number of at least 1 for time:");
        time = sc.nextDouble();
        while(time < 1){
            System.out.println("Invalid input, please enter a number of at least 1 for time:");
            time = sc.nextDouble();
        }
        System.out.println("Hours    |    Distance");
        System.out.println("----------------------");
        while(i <= time){
            distance = speed * i;
            System.out.println(i + "  |  " + distance);
            i++;
        }
    }
}