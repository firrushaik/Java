

package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class CheckAadharNumber {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[\\d]{12}");
        Matcher matcher = pattern.matcher("98772560453456");
//        System.out.println(matcher.matches());

        if(matcher.matches()){
            System.out.println("Valid aadhar number");
        }else{
            System.out.println("Invalid aadhar number");
        }
    }
}



o/p:

Invalid aadhar number
