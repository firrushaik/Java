package Strings;

import java.util.Scanner;
public class OccuranceOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        System.out.println("Enter the character to search: ");
        int target = sc.next().charAt(0);

        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == target){
                count++;
            }
        }
        System.out.println(count);
    }
}


output:

Enter the String:
java is a programming language
Enter the character to search: 
a
6
