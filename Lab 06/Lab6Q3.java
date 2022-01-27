/*
 * Alex Jenkins
 * 3/10/20
 */
import java.util.Scanner;
public class Lab6Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numStart, growthRate, days, totalOrgs = 0, i = 1;
        // input validation
        System.out.println("Input a quantity of at least 2 for num of starting organisms:");
        numStart = sc.nextDouble();
        while(numStart < 2){
            System.out.println("Invalid input, please input a quantity of at least 2 for num of starting organisms:");
            numStart = sc.nextDouble();
        }
        totalOrgs = numStart;
        System.out.println("Input the rate of growth per day as a percent (must be positive):");
        growthRate = sc.nextDouble();
        while(growthRate < 0){
            System.out.println("Invalid input, please input the rate of growth per day as a percent (must be positive):");
            growthRate = sc.nextDouble();
        }
        growthRate /= 100;
        System.out.println("Input the number of days the organisms will multiply (must be at least one):");
        days = sc.nextDouble();
        while(days < 2){
            System.out.println("Invalid input, please the number of days the organisms will multiply (must be at least one):");
            days = sc.nextDouble();
        }
        System.out.println("Day    |    Organisms");
        System.out.println("---------------------");
        while(i <= days){
            if(i > 1)
                totalOrgs += totalOrgs * growthRate;
            System.out.println(i + "   |   " + totalOrgs);
            i++;
        }
    }
}