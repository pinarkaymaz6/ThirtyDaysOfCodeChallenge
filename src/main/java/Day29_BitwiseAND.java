import java.util.*;

public class Day29_BitwiseAND {

    private static void printMaxBitwiseAnd(String[] nk) {
        for(String s: nk) {
            int max = -1;
            String[] numbers = s.split(" ");
            int n = Integer.parseInt(numbers[0]);
            int k = Integer.parseInt(numbers[1]);
            for(int i= 1; i<= n; i++){
                for(int j= i+1; j<= n; j++){
                    int result = i & j ;
                    if(result < k) {
                        if (result > max) {
                            max = result;
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] nk = new String[t];
        for (int tItr = 0; tItr < t; tItr++) {
            nk[tItr] = scanner.nextLine();
        }
        printMaxBitwiseAnd(nk);
        scanner.close();

    }
}

