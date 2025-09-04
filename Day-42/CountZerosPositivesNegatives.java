package ArrayPackage;

import java.util.Scanner;

public class CountZerosPositivesNegatives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        //create array
        int[] arr = new int[size];
        System.out.println("Enter the "+ size + " array elements");
        //read array elements
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zerosCount = 0;
        for(int i = 0;i<size;i++){
            if(arr[i] == 0){
                zerosCount++;
            }
            else if(arr[i] >= 1){
                positiveCount++;
            }
            else if(arr[i] <= -1){
                negativeCount++;
            }
        }
        System.out.println("Positive numbers are " + positiveCount + " in this array.");
        System.out.println("negative numbers are " + negativeCount + " in this array.");
        System.out.println("Zero numbers are " + zerosCount + " in this array.");

    }
}


/*

Enter the size of the array: 
7
Enter the 7 array elements
2
3
-4
6
0
-9
0
Positive numbers are 3 in this array
negative numbers are 2 in this array
Zero numbers are 2 in this array

*/