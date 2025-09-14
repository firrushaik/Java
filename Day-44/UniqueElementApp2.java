package ArrayPackage;

import java.util.Scanner;

public class UniqueElementApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int uniqueElement = 0;

        for (int i = 0; i < arr.length; i++) {
            uniqueElement ^= arr[i];
        }
        System.out.println(uniqueElement);
    }
}


output:

Enter the size of the array: 
5
Enter the 5 array elements: 
1
2
1
2
3
3
