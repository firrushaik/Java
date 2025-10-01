package LoopUsingMethod;

import java.util.Scanner;

public class SumOfNumbersUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
       int result = sumOfN(n);
        System.out.println(result);
    }
    static int sumOfN(int n){
        int sum = 0;
        for(int i=1 ;i<=n;i++){
            System.out.println(i);
            sum = sum + i;
        }
        return sum;
    }

}


output:

Enter n
4
1
2
3
4
