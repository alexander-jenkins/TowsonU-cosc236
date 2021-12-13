/*
 * Alexander Jenkins
 * 4/2/2020
 */
import java.util.*;
import java.io.*;
public class Lab8Q2{
    public static void main(String[] Args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("NumberList.txt"));
        int i, sum = 0;
        while(input.hasNextInt()){
            i = input.nextInt();
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}