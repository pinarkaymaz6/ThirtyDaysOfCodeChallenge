import java.util.*;

public class Day16_Exceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.println(Integer.parseInt(S));
        }catch(NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
