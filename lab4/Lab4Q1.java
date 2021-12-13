/*
 * Alex Jenkins
 * 2/18/20
 */
import java.util.Scanner;
public class Lab4Q1{
    public static void main(String[] args){
        int num;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input a whole number to check and see whether it is even or odd: ");
        num = keyboard.nextInt();
        if((num % 2) == 0)
            System.out.println("Your number, " + num + ", is even!");
        else
            System.out.println("Your number, " + num + ", is odd!");
  }
}