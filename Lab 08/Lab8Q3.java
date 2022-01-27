/*
 * Alexander Jenkins
 * 4/2/2020
 */
import java.util.*;
import java.io.*;
public class Lab8Q3{
    public static void main(String[] Args) throws FileNotFoundException {
        String filename;
        String line;
        int count = 1;
        Scanner cin = new Scanner(System.in);
        System.out.println("Please enter a filename to open: ");
        filename = cin.nextLine();
        File f = new File(filename);
        while(!f.isFile()){
            System.out.println("File doesn't exist, please try again: ");
            filename = cin.nextLine();
            f = new File(filename);
        }
        Scanner input = new Scanner(f);
        while(input.hasNextLine() && count <= 5){
            line = input.nextLine();
            System.out.println(line);
            count++;
        }
    }
}