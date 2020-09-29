import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {


    static Boolean emailValidation(String s){
        String pattern = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);

        if(m.matches()) return  true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(emailValidation("abc@yahoo.com"));
        System.out.println(emailValidation("abc-100@yahoo.com"));
        System.out.println(emailValidation("abc.100@yahoo.com"));
        System.out.println(emailValidation("abc111@abc.com"));
        System.out.println(emailValidation("abc-100@abc.net"));
        System.out.println(emailValidation("abc.100@abc.com.au"));
        System.out.println(emailValidation("abc@1.com "));
        System.out.println(emailValidation("abc@gmail.com.com"));
        System.out.println(emailValidation("abc+100@gmail.com"));
        System.out.println(emailValidation("abc"));
        System.out.println(emailValidation("abc@.com.my"));
        System.out.println(emailValidation("abc123@gmail.a"));
        System.out.println(emailValidation("abc123@.com"));
        System.out.println(emailValidation("abc123@.com.com"));
        System.out.println(emailValidation(".abc@abc.com"));
        System.out.println(emailValidation("abc()*@gmail.com"));
        System.out.println(emailValidation("abc@%*.com"));
        System.out.println(emailValidation("abc..2002@gmail.com"));
        System.out.println(emailValidation("abc@abc@gmail.com"));
        System.out.println(emailValidation("abc@gmail.com.1a"));
        System.out.println(emailValidation("abc@gmail.com.aa.au"));


    }
}
