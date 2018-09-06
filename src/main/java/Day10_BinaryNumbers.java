import java.util.*;

public class Day10_BinaryNumbers {
    public static List<Integer> getBinary(int n){
        List<Integer> binaryList = new ArrayList<Integer>();
        while(n != 0){
            binaryList.add(n%2);
            n /= 2;
        }
        Collections.reverse(binaryList);
        return binaryList;
    }

    public static int maxConsecutiveOnes(List<Integer> binaryList){
        boolean isConsecutive = true;
        int count = 0;
        int max = 0;
        for(int i: binaryList){
            if(isConsecutive == true){
                if(i == 1){
                    count++;
                    if(count > max){
                        max = count;
                    }
                }else{
                    count = 0;
                    isConsecutive = false;
                }
            }else{
                if(i == 1){
                    count++;
                    isConsecutive = true;
                }
            }
        }
        return max;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(maxConsecutiveOnes(getBinary(n)));
        scanner.close();
    }
}
