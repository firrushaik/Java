package ArrayPackage;

import java.util.Scanner;

public class ThreeSum {
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

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        //logic for three sum
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        System.out.println("The triplet array is: (" +arr[i] +" "+arr[j]+" "+arr[k] + ")");
                    }
                }
            }
        }

    }
}


output:

Enter the size of the array: 
6
Enter the 6 array elements: 
1
4
45
6
10
8
Enter the target: 
13
The triplet array is: (1 4 8)
