package LoopUsingMethod;

import java.util.Scanner;
public class CubeOfNUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int result =  cubeOfN(n);

        System.out.println("Cube of n is: " + result);
    }
    static int cubeOfN(int n){
        return n*n*n;

    }
}


output:

Enter the number: 
4
Cube of n is: 64
