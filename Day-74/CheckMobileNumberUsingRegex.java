
package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class CheckMobileNumber {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]{10}");
        Matcher matcher = pattern.matcher("9866673445");
//        System.out.println(matcher.matches());


        if(matcher.matches()){
            System.out.println("Valid mobile number");
        }else{
            System.out.println("Invalid mobile number");
        }
    }
}


o/p:

Valid mobile number
