/*
 * Alexander Jenkins
 * 3/22/20
*/
import java.util.Scanner;
public class Lab7Q2{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        float far, cel;
        System.out.println("Centigrade ---- Farenheit");
        for(int i = 0; i <= 20; i++){
            cel = i;
            far = (9/5) * cel + 32;
            System.out.printf("%.2f   |   %.2f%n", cel, far);
        }
    }
}