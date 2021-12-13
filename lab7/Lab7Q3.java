/*
 * Alexander Jenkins
 * 3/22/20
*/
import java.util.Scanner;
public class Lab7Q3{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int daysWorked;
        double salary = 0.01, totalPay = 0;
        System.out.println("Please enter the number of days worked (must be greater than 1):");
        daysWorked = cin.nextInt();
        while(daysWorked < 1){
            System.out.println("Incorrect input, number of days worked must be greater than 1.");
            daysWorked = cin.nextInt();
        }
        System.out.println("Salary ---- Total Pay");
        for(int i = 0; i <= daysWorked; i++){
            totalPay += salary;
            System.out.printf("$%.2f   |   $%.2f%n", salary, totalPay);
            salary *= 2;
        }
    }
}