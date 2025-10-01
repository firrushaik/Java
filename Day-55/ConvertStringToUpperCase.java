package Methods;

import java.util.Scanner;
public class ConvertToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String str = sc.nextLine();

        String result = converttoUpperCase(str);
        System.out.println(result);

    }
    static String converttoUpperCase(String str){
        String res = "";

        for(int i = 0 ;i<str.length();i++){
            if(str.charAt(i) >='a' && str.charAt(i)<='z'){
                res +=(char)(str.charAt(i)-32);
            }else{
                res +=str.charAt(i);
            }
        }
        return res;
    }
}


output:

Enter the sentence: 
java is easy
JAVA IS EASY
