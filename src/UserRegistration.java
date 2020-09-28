import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first Name : ");
        String fName=sc.next();
        System.out.println("Enter the last Name : ");
        String lName=sc.next();
        System.out.println("Enter the Email : ");
        String email=sc.next();
        System.out.println("Enter the Mobile Number : ");
        String Mob=sc.next();

        String pattern = "[A-Z]{1}[a-z]{2,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(fName);
        if(m.matches()) {
            System.out.println("Valid First Name");
        }
        else{
            System.out.println("Invalid First Name");
        }

        m = p.matcher(lName);
        if(m.matches()) {
            System.out.println("Valid Last Name");
        }
        else{
            System.out.println("Invalid Last Name");
        }

        pattern="\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
        p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        m = p.matcher(email);

        if(m.matches()) {
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }

        pattern="[0-9]{2}+[0-9]{10}";
        p = Pattern.compile(pattern);
        m = p.matcher(Mob);

        if(m.matches()) {
            System.out.println("Valid Mobile NUmber ");
        }
        else{
            System.out.println("Invalid Mobile Number ");
        }

    }
}
