package SortingAlgorithms;


import java.util.Scanner;
public class insertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //logic for insertionsort
        for(int i = 1;i<arr.length;i++) {
            int key = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > key) {
                if (arr[j - 1] > key) {
                    arr[j] = arr[j - 1];
                    j--;
                }
            }
            arr[j] = key;
        }

        //print the array
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}


out put :

Enter the size of the array: 
5
Enter the 5 array elements: 
2
4
6
8
9
2 
4 
6 
8 
9 
