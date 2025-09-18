package Array2D;

import java.util.Scanner;
public class Array2DFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //enter the size of the first array i,e rows
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        //enter the size of the second array i,e columns
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        //create 2D array
        int[][] arr = new int[rows][columns];

        System.out.println("Enter the " + rows + " rows " + columns + " columns " + " array elements: ");
        //read rows and columns array elements
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //print array
        for(int i=0 ;i<rows;i++){
            for(int j = 0;j<columns;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}



o/p:

Enter the number of rows: 
2
Enter the number of columns: 
2
Enter the 2 rows 2 columns  array elements: 
2
4
6
8

2 4 
6 8 
