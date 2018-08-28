import java.util.*;

public class Day3_IntroToConditionalStatements {

    public static String isWeird(int number) {
        if(number % 2 != 0) return "Weird";
        else{
            if(number > 7 && number < 21) return "Weird";
            else return "Not Weird";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(isWeird(N));
        scanner.close();
    }
}
