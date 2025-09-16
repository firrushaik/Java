package ArrayPackage;

import java.util.Scanner;
public class MinMaxDifferenceProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " +size+ " array elements: ");

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //logic
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

       for(int i = 0;i<arr.length;i++) {
           if (arr[i] < min) {
               min = arr[i];
           }
       }
       for(int j = 0 ;j<arr.length;j++){
           if(arr[j] > max){
               max=arr[j];
           }
       }

       System.out.println(max-min);

    }
}



o/p:

Enter the size of the array: 
8
Enter the 8 array elements: 
7
4
8
3
6
11
20
4


17


o/p:

Enter the size of the array: 
4
Enter the 4 array elements: 
1
2
3
4
The difference of minimum and maximum is: 3
