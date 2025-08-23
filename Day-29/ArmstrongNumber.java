import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int backup = n;

        int sum = 0;

        while(n!=0){
            int lastDigit = n%10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            n = n/10;
        }
        if(backup == sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}


/*
Enter the number 
153

Armstrong number

Enter the number

567
Not armstrong number

*/


Armstrong Number :

If the sum of cubes of digits in a number is equal to a number then it is armstrong number.
