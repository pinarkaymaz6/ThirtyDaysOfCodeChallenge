import java.util.*;

class Calculator{
    public int power(int n, int p) throws Exception{
        int result = 1;
        if(n<0 || p<0){
            throw new Exception("n and p should be non-negative");
        }else{
            for(int i=0; i<p; i++){
                result *= n;
            }
        }
        return result;
    }
}

public class Day17_MoreExceptions{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
