import java.util.*;

public class Day26_NestedLogic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayReturned = scanner.nextInt();
        int monthReturned = scanner.nextInt();
        int yearReturned = scanner.nextInt();

        int dayDue = scanner.nextInt();
        int monthDue = scanner.nextInt();
        int yearDue = scanner.nextInt();

        int fine = 0;

        if(yearReturned > yearDue){
            fine = 10000;
        }else if(yearReturned == yearDue) {
            if(monthReturned > monthDue){
                fine = 500 * (monthReturned - monthDue);
            }else if(monthReturned == monthDue){
                if(dayReturned > dayDue){
                    fine = 15 * (dayReturned - dayDue);
                }
            }
        }
        System.out.println(fine);

    }
}
