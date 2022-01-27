/*
 * Alex Jenkins
 * 2/25/20
 */
import java.util.Scanner;
public class Lab5Q2{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int numPackages, unitPrice = 99;
        double discountPercent, discountTotal, totalCost;
        System.out.println("Please enter the total number of packages purchased:");
        numPackages = keyboard.nextInt();
        if(numPackages >= 10 && numPackages <= 19)
            discountPercent = 0.20;
        else if(numPackages >= 20 && numPackages <= 49)
            discountPercent = 0.30;
        else if(numPackages >= 50 && numPackages <= 99)
            discountPercent = 0.40;
        else if(numPackages >= 100)
            discountPercent = 0.50;
        else
            discountPercent = 0;
        discountTotal = (numPackages * unitPrice) * discountPercent;
        totalCost = (numPackages * unitPrice) - discountTotal;
        System.out.printf("The total cost for %d packages is $%.2f. You revieved a $%.2f discount.%n", numPackages, totalCost, discountTotal);
    }
}