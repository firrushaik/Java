package Strings;

import java.util.Scanner;
public class ConvertStringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        char[] letters = str.toCharArray();

        for(int i = 0;i<letters.length;i++){
            System.out.println(letters[i]);
        }
    }
}


output:

Enter the string: 
java
j
a
v
a
