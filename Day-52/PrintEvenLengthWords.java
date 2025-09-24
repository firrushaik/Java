package Strings;

import java.util.Scanner;
public class PrintEvenLengthWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for(int i = 0;i<words.length;i++){
            String currentWord = words[i];

            if(currentWord.length() %2 == 0){
                System.out.println(currentWord);
            }
        }
    }
}



output:

Enter the string: 
java is a programming language
java
is
language
