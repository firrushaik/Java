package Methods;

import java.util.Scanner;
public class CountConsonantsByUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:" );
        String name = sc.nextLine();

        int result = countConsonants(name);
        System.out.println(result);

    }
    static int countConsonants(String name){
        int count = 0;
        for(int i = 0;i<name.length();i++) {
            char ch = name.charAt(i);

            if (name.charAt(i) != 'a' && name.charAt(i) != 'e' && name.charAt(i) != 'i' && name.charAt(i) != 'o' && name.charAt(i) != 'u' && name.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
        }
    }



output:

Enter the string:
java is easy
5
