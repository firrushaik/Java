package Methods;

import java.util.Scanner;
public class RemoveNumbersAndSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();

        String result = removeNumbersAndSpecialCharacters(sentence);
        System.out.println(result);

    }
    static String removeNumbersAndSpecialCharacters(String sentence) {
        String res = " ";

        for (int i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i) >= 'a' && sentence.charAt(i) >= 'z') || (sentence.charAt(i) >= 'A' && sentence.charAt(i) >= 'Z') || sentence.charAt(i) ==' ') {
                res += sentence.charAt(i);
            }
        }
        return res;
    }

}


output:


Enter the sentence: 
java@ is very# easy1

java is very easy

