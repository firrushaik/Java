import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        int reverseNumber = 0;
        while(n!=0){
            int lastDigit = n % 10;
            reverseNumber = reverseNumber*10 + lastDigit;
            n = n/10;
        }
        System.out.println("The reverse number is " + reverseNumber);
    }
}


/*
Enter the number
567

The reverse number is 765

Enter the number
123

The reverse number is 321

*/



