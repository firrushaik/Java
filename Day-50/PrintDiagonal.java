package Array2D;

import java.util.Scanner;

public class PrintDiagnals {
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
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //logic
        System.out.println("First diagnol: ");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                if(i == j){
                    System.out.println(arr[i][j]);
                }
            }
        }

        System.out.println("Second diagonal");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                if(j == (column-i-1)){
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
}


output:

Enter the size of the row: 
3
Enter the size of the column: 
3
Enter the array elements: 
1
2
3
4
5
6
7
8
9
First diagnol: 
1
5
9
Second diagonal
3
5
7
