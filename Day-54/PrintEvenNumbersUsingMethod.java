package LoopUsingMethod;

import java.util.Scanner;
public class PrintEvenNumbersUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        evenNumbers(n);
    }

    static void evenNumbers(int n) {
        int i = 2;

        while (i <= n) {
                System.out.println(i + " ");
                i +=2;
        }

    }
}


output:

Enter number: 
6
2 
4 
6 
