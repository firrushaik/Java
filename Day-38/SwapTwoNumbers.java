package ArrayPackage;

import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 "+ num1);
        System.out.println("num2 "+ num2);

    }
}


/*

Enter the two numbers: 
2
3
num1 3
num2 2

*/