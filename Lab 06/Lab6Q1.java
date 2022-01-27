/*
 * Alex Jenkins
 * 3/10/20
 */
import java.util.Scanner;
public class Lab6Q1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int num, sum = 0, x = 0;
        System.out.println("Please enter a postitive non-zero integer.");
        // input validation
        num = keyboard.nextInt();
        while(num < 1){
            System.out.println("Invalid input, please enter a postitive non-zero integer.");
            num = keyboard.nextInt();
        }
        while(x <= num){
            sum += x;
            x++;
        }
        System.out.println("The sum of the numbers 1 through " + num + " is " + sum + ".");
    }
}