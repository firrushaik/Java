package Methods;

import java.util.Scanner;

public class OccuranceOfCharacterUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        System.out.println("Enter the character to search: ");
        char target = sc.next().charAt(0);

        int count = occuranceOfCharacter(str, target);
        System.out.println(count);

    }
    static int occuranceOfCharacter(String str, char target){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==target){
                count++;
            }
        }
        return count;
    }
}


output:

Enter the String:
java
Enter the character to search: 
v
1
