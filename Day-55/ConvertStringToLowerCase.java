package Methods;

import java.util.Scanner;

public class ConvertStringToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String str = sc.nextLine();

        String result = convertToLowerCase(str);
        System.out.println(result);

    }
    static String convertToLowerCase(String str){
        String res = "";

        for(int i = 0 ;i<str.length();i++){
            if(str.charAt(i) >='A' && str.charAt(i)<='Z'){
                res +=(char)(str.charAt(i)+32);
            }else{
                res +=str.charAt(i);
            }
        }
        return res;
    }

}


output:

Enter the sentence: 
JAVA IS EASY TO LEARN
java is easy to learn

