package ArrayPackage;

import java.util.Scanner;
public class FindingAverageOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        //create array
        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for(int i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        // logic for average of array
        int sum=0;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];

       }
        System.out.println(sum / arr.length);
    }
}


output:

Enter the size of the array
5
Enter the 5 array elements: 
4
7
3
6
10

6

