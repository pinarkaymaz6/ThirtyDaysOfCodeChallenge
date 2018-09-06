import java.util.*;

public class Day11_2DArrays {
    public static int findMaxHourglass(int[][] arr){
        int max = -1;
        int sum = -500;
        for (int i = 0; i < arr[0].length-2; i++){
            for (int j = 0; j < arr[1].length-2; j++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void printMaxHourGlass(int[][] arr, int[] index){

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(findMaxHourglass(arr));
        scanner.close();
    }
}
