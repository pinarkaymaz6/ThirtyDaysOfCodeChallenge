import java.util.*;

    public class Day20_Sorting {
        public static void bubleSort(int[] array){
            int swapCount = 0;
            int end = array.length-1;

            while(end > 0) {
                int swapPosition = 0;
                for (int i = 0; i < end; i++) {
                    if(array[i] > array[i+1]){
                        int temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        swapCount++;
                    }
                    swapPosition = i;
                }
                end = swapPosition;
            }
            System.out.println("Array is sorted in "+ swapCount + " swaps.");
            System.out.println("First Element: " + array[0]);
            System.out.println("Last Element: " + array[array.length-1] );
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            bubleSort(a);
        }
    }