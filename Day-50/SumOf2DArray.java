package Array2D;

import java.util.Scanner;
public class SumOf2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first array row1 : ");
        int row1 = sc.nextInt();

        System.out.println("Enter the first array column1 : ");
        int column1 = sc.nextInt();

        //create first array
        int[][] a = new int[row1][column1];

        System.out.println("Enter the first array elements: ");
        //read elements
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second array rows: ");
        int row2 = sc.nextInt();

        System.out.println("Enter the second array columns: ");
        int column2 = sc.nextInt();

        // create second array
        int[][] b = new int[row2][column2];

        System.out.println("Enter the second array elements: ");
        //read second array elements
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int[][] res = new int[row1][column1];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print(res[i][j] + " ");
            }
        System.out.println();
    }
    }
}



o/p:

Enter the first array row1 : 
2
Enter the first array column1 : 
2
Enter the first array elements: 
1
2
3
4
Enter the second array rows: 
2
Enter the second array columns: 
2
Enter the second array elements: 
1
2
3
4

2 4 
6 8 
