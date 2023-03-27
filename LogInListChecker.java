import java.util.ArrayList;
import java.util.Scanner;

public class LogInListChecker {
    static Scanner sc = new Scanner(System.in);
    static ArrayList <String> UList =  new ArrayList<>();
    static ArrayList<String> PList = new ArrayList<>();

    public static void main(String[] args) {
        UList.add("User1");
        UList.add("User2");
        UList.add("User3");
        PList.add("Pass1");
        PList.add("Pass2");
        PList.add("Pass3");

        Boolean end = false;

        while (end == false) {
        System.out.print("\nUsername: ");
        String Uname = sc.next();
        System.out.print("Password: ");
        String Pname = sc.next();
      
        if (UList.contains(Uname) && PList.contains(Pname)){
            if ((UList.indexOf(Uname)) == (PList.indexOf(Pname))){
                System.out.println("Log In Success");
                end = true;
                break;
            }
            else {
                System.out.println("Username and Password does not Match");
            }
            
        }
        else if (!UList.contains(Uname) && PList.contains(Pname)){
            System.out.println("Incorrect Username");
        }
        else if (UList.contains(Uname) && !PList.contains(Pname)) {
            System.out.println("Incorrect Password");
        }
        else  if (!UList.contains(Uname) && !PList.contains(Pname)) {
            System.out.println("Incorrect Username & Password");
        }
    }
        
    }
}
