package Methods;

import java.util.Scanner;
public class ConvertStringToCharArrayUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        convertStringToChar(str);


    }
    static void convertStringToChar(String str){
        char[] letters = str.toCharArray();

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
