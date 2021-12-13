/*
 * Alex Jenkins
 * 4/12/20
 */
import java.util.Scanner;
public class Lab9Q3{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        double m, v, ke;
        System.out.println("Please enter the mass of the object");
        m = cin.nextDouble();
        System.out.println("Please enter the velocit of the object");
        v = cin.nextDouble();
        ke = kineticEnergy(m, v);
        System.out.printf("The kinetic energy of your object is %.2f\n", ke);
    }
    public static double kineticEnergy(double m, double v){
        double ke = (m * v * v) / 2;
        return ke;
    }
}