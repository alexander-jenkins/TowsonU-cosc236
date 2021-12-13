/*
 * Alex Jenkins
 * 2/18/20
 */
import java.util.Scanner;
public class Lab4Q2{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("Please input a number 1 through 5: ");
        num = keyboard.nextInt();
        if (num == 1)
            System.out.println("The roman numeral of your you number, " + num + ", is I.");
        else if (num == 2)
            System.out.println("The roman numeral of your you number, " + num + ", is II.");
        else if (num == 3)
            System.out.println("The roman numeral of your you number, " + num + ", is III.");
        else if (num == 4)
            System.out.println("The roman numeral of your you number, " + num + ", is IV.");
        else if (num == 5)
            System.out.println("The roman numeral of your you number, " + num + ", is V.");
        else
            System.out.println("Incorrect number was entered. Please try again!");
    }
}