package Strings;

import java.util.Scanner;
public class countConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name we have to find consonants: ");
        String name = sc.nextLine();

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != 'a' && name.charAt(i) != 'e' && name.charAt(i) != 'i' && name.charAt(i) != 'o' && name.charAt(i) != 'u') {
                count++;
            }
        }
        System.out.println(count);

    }
}


output:

Enter the name we have to find consonants: 
umbrella
5
