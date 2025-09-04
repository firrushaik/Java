package ArrayPackage;

import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // read the array elements
        System.out.println("Enter the " + size + " array elements: ");
        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        // find second largest element

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i<size;i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("second largest element in the array: "+ secondLargest);

    }
}


/*

Enter the size of the array: 
5
Enter the 5 array elements: 
3
4
5
6
8
second largest element in the array: 6

*/