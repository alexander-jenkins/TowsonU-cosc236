/*
 * Alex Jenkins
 * 2/18/20
 */
import java.util.Scanner;
public class Lab4Q4{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double scoreOne, scoreTwo, scoreThree, avg;
        char letterGrade;
        System.out.println("Please enter test score one: ");
        scoreOne = keyboard.nextDouble();
        System.out.println("Please enter test score two: ");
        scoreTwo = keyboard.nextDouble();
        System.out.println("Please enter test score three: ");
        scoreThree = keyboard.nextDouble();
        avg = ((scoreOne + scoreTwo + scoreThree) / 3);
        if ((avg >= 90) && (avg <= 100))
            letterGrade = 'A';
        else if ((avg >= 80) && (avg <= 89))
            letterGrade = 'B';
        else if ((avg >= 70) && (avg <= 79))
            letterGrade = 'C';
        else if ((avg >= 60) && (avg <= 69))
            letterGrade = 'D';
        else if (avg < 60)
            letterGrade = 'F';
        else
            letterGrade = '?';
        System.out.println("The average score is " + avg + " which is a(n) " + letterGrade + ".");
    }
}