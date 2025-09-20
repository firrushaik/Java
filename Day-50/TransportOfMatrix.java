package Array2D;

import java.util.Scanner;

public class TransportOfMatrix {
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

        //logic for transport matrix
        int[][] res = new int[column][row];
        for(int i = 0;i<column;i++){
            for(int j=0;j<row;j++){
                res[i][j] =arr[j][i];
            }
        }
        //print result array
        for(int i =0;i<column;i++){
            for(int j = 0;j<row;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
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

1 3 
2 4 
