package LoopUsingMethod;

import java.util.Scanner;

public class SquareOfNumberUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int result =  squareOfN(n);

        System.out.println("Square of n is: " + result);
    }
    static int squareOfN(int n){
        return n*n;

    }
}


output:

Enter the number: 
4
Square of n is: 16
