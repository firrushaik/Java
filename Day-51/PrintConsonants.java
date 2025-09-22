package Strings;

import java.util.Scanner;

public class PrintConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name we have to find consonants: ");
        String name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != 'a' && name.charAt(i) != 'e' && name.charAt(i) != 'i' && name.charAt(i) != 'o' && name.charAt(i) != 'u') {
                System.out.println(name.charAt(i));
            }
        }

    }
}


output:

Enter the name we have to find consonants: 
umbrella
m
b
r
l
l
