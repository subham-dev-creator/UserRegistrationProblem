import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

    static Boolean flNameValidation(String s){
        String pattern = "[A-Z]{1}[a-z]{2,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        if(m.matches()) return  true;
        else return false;
    }

    static Boolean emailValidation(String s){
        String pattern = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);

        if(m.matches()) return  true;
        else return false;
    }


    static Boolean mobNumValidation(String s){
        String pattern="[0-9]{2}+[0-9]{10}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);

        if(m.matches()) return  true;
        else return false;
    }

    static Boolean passValidation(String s){
        String pattern= "^(?=.*[A-Z])+.{8,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);

        if(m.matches()) return true;
        else return false;
    }

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
        System.out.println("Enter the Password : ");
        String pass=sc.next();

        if(flNameValidation(fName))
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");

        if(flNameValidation(lName))
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");

        if(emailValidation(email))
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");

        if(mobNumValidation(Mob))
            System.out.println("Valid Mobile NUmber ");
        else
            System.out.println("Invalid Mobile Number ");

        if(passValidation(pass))
            System.out.println("Valid Password ");
        else
            System.out.println("Invalid Password ");

    }
}
