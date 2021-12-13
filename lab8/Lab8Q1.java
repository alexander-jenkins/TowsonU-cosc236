/*
 * Alexander Jenkins
 * 4/2/2020
 */
import java.util.*;
import java.io.*;
public class Lab8Q1{
    public static void main(String[] Args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new File("NumberList.txt"));
        for(int i = 1; i <= 100; i++){
            out.println(i);
        }
    }
}