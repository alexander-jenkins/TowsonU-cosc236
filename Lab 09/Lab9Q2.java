/*
 * Alex Jenkins
 * 4/12/20
 */
import java.util.Scanner;
public class Lab9Q2{
    public static void main(String[] args){
        double length, width, area;
        length = getLength();
        width = getWidth();
        area = getArea();
        displayArea(length, width, area);
    }
    public static double getLength(){
        Scanner cin = new Scanner(System.in);
        double length;
        System.out.println("Please enter the length of the rectangle: ");
        length = cin.nextDouble();
        return length;
    }
    public static double getWidth(){
        Scanner cin = new Scanner(System.in);
        double width;
        System.out.println("Please enter the width of the rectangle: ");
        width = cin.nextDouble();
        return width;
    }
    public static double getArea(){
        Scanner cin = new Scanner(System.in);
        double area;
        System.out.println("Please enter the area of the rectangle: ");
        area = cin.nextDouble();
        return area;
    }
    public static void displayArea(double length, double width, double area){
        System.out.printf("The length of your rectangle is: %f\n", length);
        System.out.printf("The width of your rectangle is: %f\n", width);
        System.out.printf("The area of your rectangle is: %f\n", area);
    }    
}