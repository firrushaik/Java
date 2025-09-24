package Strings;

import java.util.Arrays;
import java.util.Scanner;
public class CheckIsAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();

        if(s1.length() != s2.length()){
            System.out.println("Not anagram");
            return; //used to come out from the method
        }

        //convert strings into arrays

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean isAnagram = true;
        for(int i = 0;i<c1.length;i++){
            if(c1[i] != c2[i]){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}


output:

Enter the first string: 
cat
Enter the second string: 
atc
Anagram



Enter the first string: 
umbrella
Enter the second string: 
rain
Not anagram
