package LoopUsingMethod;

import java.util.Scanner;

public class PrintOddNumbersUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        oddNumbers(n);
    }

    static void oddNumbers(int n) {
        int i = 1;

        while (i <= n) {
            System.out.println(i + " ");
            i +=2;
        }

    }
}

output:

Enter number: 
6
1 
3 
5 