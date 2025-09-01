package ArrayPackage;

import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for(int i =0;i<size;i++){
            arr[i] =sc.nextInt();
        }

        // check element is there or not

        System.out.println("Enter the target element: " );
        int target = sc.nextInt();

        boolean isElementThere = false;
        int index = -1;
        for(int i =0; i<size ;i++){
            if(arr[i] == target){
                isElementThere = true;
            index = i;
            break;
            }
        }
        System.out.println("Element is there at  " + index + " index");
    }
}

/*

Enter the size of the array: 
2
Enter the 2 array elements: 
2
3
Enter the target element: 
3
Element is there at  1 index

*/