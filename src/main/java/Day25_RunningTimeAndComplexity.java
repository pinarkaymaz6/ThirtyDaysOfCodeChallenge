import java.util.*;

public class Day25_RunningTimeAndComplexity {

    public static boolean isPrime(int number) {

        if(number == 2){
            return true;
        }else if(number < 2 || number % 2 == 0){
            return false;
        }else if (number < 25) {
            for (int j = 3; j < number; j = j + 2) {
                if (number % j == 0) {
                    return false;
                }
            }
        } else {
            for (int j = 3; j * j <= number; j = j + 2) {
                if (number % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iteration = scanner.nextInt();
        for(int i =0; i < iteration; i++){
            if(isPrime(scanner.nextInt())){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
    }
}