package Strings;

import java.util.Scanner;
public class palindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check it is palindome or not:");
        String name = sc.nextLine();
        String reverseString = "";

        for(int i = name.length()-1;i>=0;i--) {
            reverseString += name.charAt(i);
        }
            if(name.equals(reverseString)){
                System.out.println("palindrome!!");
            }else{
                System.out.println("Not palindrome!!");
            }

        }
    }



o/p:
Enter the string to check it is palindome or not:
amma
palindrome!!




Enter the string to check it is palindome or not:
java
Not palindrome!!

Process finished with exit code 0
