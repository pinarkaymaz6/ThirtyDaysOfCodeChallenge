
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1_DataTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double floatingNumber = scan.nextDouble();
        String str = scan.next();
        str += scan.nextLine();
        System.out.println(i+number);
        System.out.println(d+floatingNumber);
        System.out.println(s+str);
        scan.close();

    }
}