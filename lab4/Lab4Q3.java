/*
 * Alex Jenkins
 * 2/18/20
 */
import java.util.Scanner;
public class Lab4Q3{
    public static void main(String[] args){
        double lengthOne, widthOne, lengthTwo, widthTwo, areaOne, areaTwo;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the length of rectangle one: ");
        lengthOne = keyboard.nextDouble();
        System.out.println("Please input the width of rectangle one: ");
        widthOne = keyboard.nextDouble();
        System.out.println("Please input the length of rectangle two: ");
        lengthTwo = keyboard.nextDouble();
        System.out.println("Please input the width of rectangle two: ");
        widthTwo = keyboard.nextDouble();
        areaOne = lengthOne * widthOne;
        areaTwo = lengthTwo * widthTwo;
        System.out.println("The area of rectangle one is " + areaOne + " and the area of rectangle two is " + areaTwo + ".");
        if (areaOne == areaTwo)
            System.out.println("The areas of the two rectangles are equal");
        else if (areaOne > areaTwo)
            System.out.println("The area of rectangle one is larger than that of rectangle two.");
        else if (areaTwo > areaOne)
            System.out.println("The area of rectangle two is larger than that of rectangle one.");
        else
            System.out.println("Something went wrong.");
    }
}