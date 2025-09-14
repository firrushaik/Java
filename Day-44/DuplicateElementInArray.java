package ArrayPackage;

import java.util.Scanner;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        arr[j] =Integer.MIN_VALUE;
                        break;
                    }
                }
            }
            if (isDuplicate) {
                System.out.println(arr[i]);
            }
        }
    }
}


output:

Enter the size of the array: 

5
Enter the 5 array elements: 
1
2
3
4
4
4
