package Strings;

import java.util.Scanner;
public class printCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) != ' ' ){
                System.out.println(str.charAt(i));
            }
        }
    }
}


output:

Enter the string: 
java is easy
j
a
v
a
i
s
e
a
s
y
