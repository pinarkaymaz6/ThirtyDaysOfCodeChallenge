import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day5_Loops {

    public static void printMultiples(int number){
        for(int i=1; i<=10; i++){
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        printMultiples(n);
        scanner.close();
    }
}
