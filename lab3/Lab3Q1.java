/*
 * Alex Jenkins
 * 2/18/20
 * Miles Per Gallon
*/
import java.util.Scanner;
public class Lab3Q1{
    public static void main(String[] args){
        double milesDriven, gallonsOfGas, mpg;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the number of miles driven: ");
        milesDriven = keyboard.nextDouble();
        System.out.println("Please input the number of gallons of gas used: ");
        gallonsOfGas = keyboard.nextDouble();
        mpg = milesDriven / gallonsOfGas;
        System.out.println("You get " + mpg + " miles per gallon!");
    }
}