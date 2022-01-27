/*
 * Alexander Jenkins
 * 3/22/20
 */
import java.util.Scanner;
public class Lab7Q1{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int flag = 1, highest = 0, lowest = 0, num;
        System.out.println("Please enter a sequence of numbers");
        while(flag == 1){
            num = cin.nextInt();
            if(num > highest && num != -99){
                highest = num;
            }
            else if(num < lowest && num != -99){
                lowest = num;
            }
            else if(num == -99){
                flag = 0;
            }
        }
        System.out.println("The highest number was: " + highest + " and lowest number was " + lowest + ".");
    }
}