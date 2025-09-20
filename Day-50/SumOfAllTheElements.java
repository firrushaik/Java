package Array2D;

import java.util.Scanner;
public class SumOfAllTheElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the size of the column: ");
        int column = sc.nextInt();

        // create array
        int[][] arr = new int[row][column];

        //read elements
        System.out.println("Enter the array elements: ");
        for(int i =0;i<row;i++){
            for(int j= 0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //logic

        int sum = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0 ;j<column;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("sum of all the elements: " + sum);
    }
}


output:

Enter the size of the row: 
2
Enter the size of the column: 
2
Enter the array elements: 
1
2
3
4
sum of all the elements: 10

