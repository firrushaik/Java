Palindrome number ; After reversing a number, if it is equal to given number then it is palindrome.

import java.util.Scanner;
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int backup = n;

        int reverseNumber = 0;

        while(n!=0){
            int lastDigit = n%10;
            reverseNumber = reverseNumber*10 + lastDigit;
            n = n/10;
        }
        if(backup == reverseNumber){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}


/* Enter number

121
Palindrome number

4
Palindrome number

678
Not palindrome number 

*/