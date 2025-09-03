package ArrayPackage;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for(int i = 0 ;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the required number : ");
        int required = sc.nextInt();

        int left = 0;
        int right = size-1;

        boolean isElementThere = false;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]==required){
                isElementThere = true;
                break;
            }else if(arr[mid]>required){
                right = mid-1;
            }else if(arr[mid]<required){
                left = mid+1;
            }
        }
        if(isElementThere){
            System.out.println("Element is there");
        }else{
            System.out.println("Element is not there");
        }
    }
}


/*

Enter the size of the array: 
5
Enter the 5 array elements: 
4
5
6
7
8
Enter the required number : 
9
Element is not there

*/

/*

Enter the size of the array: 
7
Enter the 7 array elements: 
3
4
5
6
7
8
9
Enter the required number : 
4
Element is there

*/