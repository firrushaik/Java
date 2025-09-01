package ArrayPackage;

import java.util.Scanner;
public class ReverseArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for(int i =0;i<=size-1;i++){
            arr[i] =sc.nextInt();
        }

        int[] newArr = new int[size];

        int j = 0;
        for(int i =size-1; i>=0 ;i--){
            newArr[j] = arr[i];
            j++;
        }
        System.out.println("Reverse array elements is: ");
        for(int i=0;i<size;i++){
            System.out.println(newArr[i]);
        }
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
7
Reverse array elements is: 
7
6
5
4
3

*/