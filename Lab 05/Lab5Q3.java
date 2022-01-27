/*
 * Alex Jenkins
 * 2/25/20
 */
import java.util.Scanner;
public class Lab5Q3{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double gramsFat, numCalories, percentFat, calsFromFat;
        System.out.println("Input the number of calories: ");
        numCalories = keyboard.nextDouble();
        System.out.println("Input the number of grams of fat: ");
        gramsFat = keyboard.nextDouble();
        calsFromFat = gramsFat * 9;
        percentFat = calsFromFat / numCalories;
        if(calsFromFat < numCalories){
            if(percentFat < 0.30){
                System.out.println("This food is low in fat!");
                System.out.printf("The percent of calories that come from fat is %.2f%n", percentFat);
            }
            else{
                System.out.printf("The percent of calories that come from fat is %.2f%n", percentFat);
            }
        }
        else
            System.out.println("Input is invalid, please try again.");
    }
}