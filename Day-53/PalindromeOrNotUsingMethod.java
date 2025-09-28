package Methods;

import java.util.Scanner;

public class PalindromeOrNotUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check it is palindome or not:");
        String name = sc.nextLine();
        String reverseString = "";

        for(int i = name.length()-1;i>=0;i--) {
            reverseString += name.charAt(i);
        }

        boolean res = palindromeOrNot(name,reverseString);

        if(res){
            System.out.println("Palindrome!!");
        }else{
            System.out.println("Not Palindrome!!");
        }
    }

    static boolean palindromeOrNot(String name, String reverseString) {

        if (name.equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }
}


output:

Enter the string to check it is palindome or not:
radar
Palindrome!!
