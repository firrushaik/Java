package ArrayPackage;

import java.util.Scanner;
public class SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " array elements: ");
        for(int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

            // check second smallest element

            int firstsmallest = Integer.MAX_VALUE;
            int secondsmallest = Integer.MAX_VALUE;

            for(int i = 0; i<n;i++){
                if(arr[i]<firstsmallest){
                    secondsmallest = firstsmallest;
                    firstsmallest = arr[i];
                }else if(arr[i]<secondsmallest && arr[i]>firstsmallest){
                    secondsmallest=arr[i];
                }
            }
            System.out.println("second smallest element in the array: "+ secondsmallest);
        }
}

/*
Enter the size of the array: 
3
Enter the 3array elements: 
3
4
5
second smallest element in the array: 4

*/
