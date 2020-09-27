import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first Name : ");
        String fName=sc.next();

        String pattern = "[A-Z]{1}[a-z]{2,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(fName);
        if(m.matches()) {
            System.out.println("Valid First Name");
        }
        else{
            System.out.println("Invalid First Name");
        }
    
    }
}
