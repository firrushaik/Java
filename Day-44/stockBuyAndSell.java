package ArrayPackage;

import java.util.Scanner;

public class stockBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //stock buy and sell
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int costPrice = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - costPrice;

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        System.out.println(maxProfit);

    }
}



output:

Enter the size of the array: 
5
Enter the 5 array elements: 
2
3
6
7
8
6
