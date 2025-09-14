package SortingAlgorithms;

import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        //print the array
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}


OutPut:

Enter the size of the array: 
6
Enter the 6 array elements: 
7
8
4
9
5
2
2 
4 
5 
7 
8 
9 

