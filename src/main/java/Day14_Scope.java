import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;
    // Add your code here
    Difference(int[] elements){
        this.elements = elements;
        this.maximumDifference = 0;
    }

    public void computeDifference(){
        for(int i = 0; i< elements.length; i++){
            for(int j = i+1; j< elements.length ; j++){
                int difference = (elements[i] >= elements[j]? elements[i]-elements[j] : elements[j]-elements[i]);
                if(difference > maximumDifference){
                    maximumDifference = difference;
                }
            }
        }
    }
} // End of Difference class

public class Day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
