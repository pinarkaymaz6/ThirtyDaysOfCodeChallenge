import java.util.*;

public class Day28_RegExPatternsAndIntroToDatabases {

    private static void printGmailAccounts(String[] nameEmailID) {
        List<String> list = new ArrayList<String>();
        for(String s: nameEmailID){
            String[] profiles = s.split(" ");
            String name = profiles[0];
            String email = profiles[1];

            if(email.contains("@gmail.com")){
                list.add(name);
            }
        }
        Collections.sort(list);
        for(String s:list){
            System.out.println(s);
        }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] nameEmailID = new String[N];
        for (int NItr = 0; NItr < N; NItr++) {
            nameEmailID[NItr] = scanner.nextLine();
        }
        printGmailAccounts(nameEmailID);

        scanner.close();
    }


}