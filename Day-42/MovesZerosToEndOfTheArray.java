package ArrayPackage;

import java.util.Scanner;
public class MoveZerosToEndOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        // create array
        int[] arr = new int[size];

        //asks user to enter array elements
        System.out.println("Enter the "+ size + " array elements : ");

        //read array elements
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        //create new array
        int newArr[] = new int[size];

        int j = 0;
        for(int i = 0; i<size;i++){
            if (arr[i] != 0) {
               newArr[j] = arr[i];
               j++;

            }
        }
        for(int i = 0;i<size;i++){
            System.out.print(newArr[i] + " ");
        }
    }
}


/*

Enter the size of the array: 
7
Enter the 7 array elements : 
2
4
6
0
0
1
0
2 4 6 1 0 0 0 

*/