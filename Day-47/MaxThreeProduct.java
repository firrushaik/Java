package ArrayPackage;

import java.util.Scanner;

public class MaxTripleProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // max product
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length-2;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if((arr[i]*arr[j]*arr[k]) > max){
                        max = arr[i]*arr[j]*arr[k];
                    }
                }
            }
        }
        System.out.println(max);
    }

}


o/p:

Enter the size of the first array: 
5
Enter the 5 array elements: 
10
3
5
6
20

1200

