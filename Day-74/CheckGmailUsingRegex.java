
package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class CheckGmail {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-z0-9]{5,20}@[a-z]{3,10}.[a-z]{2,10}");
        Matcher matcher = pattern.matcher("shaik123@gmail.Com");
//        System.out.println(matcher.matches());

        if(matcher.matches()){
            System.out.println("Valid email");
        }else{
            System.out.println("Not valid email");
        }
    }
}



o/p:
Not valid email // Because in the com C is Capital 

2)

package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class CheckGmail {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-z0-9]{5,20}@[a-z]{3,10}.[a-z]{2,10}");
        Matcher matcher = pattern.matcher("shaik123@gmail.com");
//        System.out.println(matcher.matches());

        if(matcher.matches()){
            System.out.println("Valid email");
        }else{
            System.out.println("Not valid email");
        }
    }
}


o/P:

Valid email
