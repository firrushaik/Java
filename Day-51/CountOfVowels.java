package Strings;

import java.util.Scanner;
public class countVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Vowels count is: " + count);
    }
}



output:

Enter the string: 
amma
Vowels count is: 2

