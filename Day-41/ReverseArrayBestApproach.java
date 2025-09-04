package ArrayPackage;

import java.util.Scanner;

public class ReverseArrayApproach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // reverse the array

        int left = 0;
        int right = size-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] =temp;

            left++;
            right--;
        }
        //print reverse array
        for(int i = 0 ;i<size;i++){
            System.out.println(arr[i]);
        }

    }
}


/*

Enter the size of the array: 
4
Enter the 4 array elements: 
3
4
5
6
6
5
4
3

*/