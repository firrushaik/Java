package Strings;

import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        String reverseStr = "";
        for(int i = str.length()-1;i>=0;i--){
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);
    }
}


output:

Enter the String: 
java
avaj



Enter the String: 
umbrella
allerbmu
