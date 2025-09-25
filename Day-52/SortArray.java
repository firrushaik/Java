package Strings;

import java.util.Scanner;
import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:" );
        String str =sc.nextLine();

        char[] letters = str.toCharArray();

        for(int i = 0;i<letters.length;i++){
            System.out.println(letters[i]);
        }

        Arrays.sort(letters);
        System.out.println("After sorting: ");
        for(int i = 0;i<letters.length;i++){
            System.out.println(letters[i]);
        }
    }
}



output:

Enter the String:
java
j
a
v
a
After sorting: 
a
a
j
v
