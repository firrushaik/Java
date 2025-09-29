package Methods;

import java.util.Scanner;
public class ReverseStringUsingMethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String reverse = reverseString(str);
        System.out.println(reverse);
    }

    static String reverseString(String str){
        String reverseString = "";
        for(int i = str.length()-1;i>=0;i--){
            reverseString += str.charAt(i);
        }
        return reverseString;
    }
}


output:

Enter the string: 
java
avaj