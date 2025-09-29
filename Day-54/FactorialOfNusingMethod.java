package LoopUsingMethod;

import java.util.Scanner;

public class FactorialOfnUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int fact = factorial(n);
        System.out.println(fact);

    }

    static int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }
}


output:

Enter the number: 
4
24
