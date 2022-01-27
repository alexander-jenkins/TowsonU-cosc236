/*
 * Alex Jenkins
 * 4/12/20
 */
import java.util.Scanner;
public class Lab9Q1{
    public static void main(String[] Args){
        double wCost;
        double mPercent;
        double rPrice;
        Scanner cin = new Scanner(System.in);
        System.out.println("Please enter the wholesale cost:");
        wCost = cin.nextDouble();
        System.out.println("Please enter the markup percentage:");
        mPercent = cin.nextDouble();
        rPrice = calculateRetail(wCost, mPercent);
        System.out.printf("The retail price of your item is: %.2f", rPrice);
    }
    public static double calculateRetail(double wCost, double mPercent){
        double rPrice = wCost + wCost * (mPercent / 100);
        return rPrice;
    }
}