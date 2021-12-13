/*
 * Alex Jenkins
 * 2/18/20
 * Profit Earned
*/
import java.util.Scanner;
public class Lab3Q3{
    public static void main(String[] args){
        double profit, retailPrice;
        final double profitRate = 0.4;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the retail price of the circuit board: ");
        retailPrice = keyboard.nextDouble();
        profit = retailPrice * profitRate;
        System.out.println("The circuit board cost you $" + retailPrice + ".");
        System.out.println("The retailer made $" + profit + " as profit.");
    }
}