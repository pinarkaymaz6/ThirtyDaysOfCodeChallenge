import java.io.*;
import java.util.*;

public class Day6_LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<String>();
        int iterations = scanner.nextInt();

        for(int i =0; i<iterations;i++){
            inputList.add(scanner.next());
        }
        for(String s : inputList ){
            char[] input = s.toCharArray();
            String odds = "";
            String evens = "";
            for(int i=0; i< input.length; i++){
                if(i%2 == 0){
                    evens += input[i];
                }else{
                    odds += input[i];
                }
        }
        System.out.println(evens + " " + odds);
        }
    }
}
