package Strings;

import java.util.Scanner;
public class printVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name we have to find vowels: ");
        String name = sc.nextLine();

        for(int i = 0;i<name.length();i++){
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'|| name.charAt(i) == 'u'){
                System.out.println(name.charAt(i));
            }
        }

    }
}



output:

Enter the name we have to find vowels: 
amma
a
a



Enter the name we have to find vowels: 
jhhbf

Process finished with exit code 0