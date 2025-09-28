package Methods;

import java.util.Arrays;
import java.util.Scanner;
public class IsAnagramOrNotUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();

        boolean res = isAnagram(s1 , s2);
        if(res){
            System.out.println("Anagram!!");
        }else{
            System.out.println("Not Anagram");
        }
    }

    static boolean isAnagram(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0;i<c1.length;i++){
            if(c1[i] !=c2[i]){
                return false;
            }
        }
        return true;
    }
}


output:

Enter the first string: 
geeks
Enter the second string: 
kseeg
Anagram!!
