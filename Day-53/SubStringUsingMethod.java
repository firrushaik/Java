package Methods;

import java.util.Scanner;
public class SubStringUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        allSubString(str);

    }

    static void allSubString(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k) + " ");
                }
                System.out.println();
            }
        }
    }
}



output:

Enter the string: 
java
j 
j a 
j a v 
j a v a 
a 
a v 
a v a 
v 
v a 
a 
