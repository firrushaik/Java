package LoopUsingMethod;

import java.util.Scanner;
public class ArmstringOrNotUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();


        if(isArmstrong(n)){
            System.out.println("Armstrong number!!");
        }else{
            System.out.println("Not Armstrong number!!");
        }
    }
    static boolean isArmstrong(int n){
        int backUp = n;
        int sum = 0;

        while(n!=0){
            int lastDigit = n%10;

            sum += lastDigit * lastDigit * lastDigit;

            n = n/10;
        }
        return backUp == sum;
    }
}


output:

Enter the number: 
153
Armstrong number!!
