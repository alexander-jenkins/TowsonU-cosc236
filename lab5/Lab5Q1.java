/*
 * Alex Jenkins
 * 2/25/20
 */
import java.util.Scanner;
public class Lab5Q1{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double mass, weight;
        final double gravity = 9.8;
        System.out.println("Please input the mass, in kilograms, of the object being weighed.");
        mass = keyboard.nextDouble();
        weight = mass * gravity;
        if(weight > 1000)
            System.out.printf("This object is too heavy, (It weighs %.2f Newtons).%n", weight);
        
        else if(weight<10)
            System.out.printf("This object is too light, (It weighs %.2f Newtons).%n", weight);
        
        else
            System.out.printf("This object weighs %.2f Newtons.%n", weight);
    }
}