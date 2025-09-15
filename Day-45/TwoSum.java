package ArrayPackage;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        //create array
        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The array pair is: (" + arr[i] + " " + arr[j] +")");
                }
            }
        }
    }
}


output:

Enter the size of the array: 
5
Enter the 5 array elements: 
2
6
5
8
11
Enter the target: 
14
The array pair is: (6 8)

