/*
 * Alex Jenkins
 * 2/18/20
 * Sales Tax
*/
import java.util.Scanner;
public class Lab3Q4{
    public static void main(String[] args){
        double totalTax, stateTax, countyTax, purchaseTotal, saleTotal;
        final double stateTaxRate = 0.04;
        final double countyTaxRate = 0.02;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the purchase total: ");
        purchaseTotal = keyboard.nextDouble();
        stateTax = purchaseTotal * stateTaxRate;
        countyTax = purchaseTotal * countyTaxRate;
        totalTax = stateTax + countyTax;
        saleTotal = totalTax + purchaseTotal;
        System.out.println("Your purchase total was $" + purchaseTotal);
        System.out.println("Your state tax was $" + stateTax);
        System.out.println("Your county tax was $" + countyTax);
        System.out.println("Your total tax was $" + totalTax);
        System.out.println("Your sale total was $" + saleTotal);
    }
}