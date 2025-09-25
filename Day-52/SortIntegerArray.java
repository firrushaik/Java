package Strings;

import java.util.Scanner;
import java.util.Arrays;
public class SortIntegerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:" );
        int size = sc.nextInt();

        int[] arr = new int[size];

        //read elements
        System.out.println("Enter the elements:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}



output:

Enter the size of the array:
4
Enter the elements:
34
67
12
4
4 12 34 67 
