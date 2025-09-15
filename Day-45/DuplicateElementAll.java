package ArrayPackage;

import java.util.Scanner;

public class PrintAllTheDuplicateElements {
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

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The duplicate element is: " + arr[i]);
                    break;
                }
            }
        }
    }
}


Enter the size of the array: 
5
Enter the 5 array elements: 
1
2
3
4
4
The duplicate element is: 4
