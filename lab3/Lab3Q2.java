/*
 * Alex Jenkins
 * 2/18/20
 * Test Scores
*/
import java.util.Scanner;
public class Lab3Q2{
    public static void main(String[] args){
        double scoreOne, scoreTwo, scoreThree, testAvg;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input test score one: ");
        scoreOne = keyboard.nextDouble();
        System.out.println("Please input test score two: ");
        scoreTwo = keyboard.nextDouble();
        System.out.println("Please input test score three: ");
        scoreThree = keyboard.nextDouble();
        testAvg = (scoreOne + scoreTwo + scoreThree) / 3;
        System.out.println("Score one is: " + scoreOne + "\nScore two is: " + scoreTwo + "\nScore three is: " + scoreThree);
        System.out.println("The average test score is: " + testAvg);
    }
}