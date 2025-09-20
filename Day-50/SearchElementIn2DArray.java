package Array2D;

import java.util.Scanner;
public class SearchElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the size of the column: ");
        int column = sc.nextInt();

        //create 2D array
        int[][] arr = new int[rows][column];
        System.out.println("Enter the array elements: ");

        //read element
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();

        boolean isElementThere = false;

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<column;j++){
                if(arr[i][j] == target){
                    isElementThere = true;
                    break;
                }
            }
        }
        if(isElementThere){
            System.out.println("Element is there!!");
        }else{
            System.out.println("Element is not there!!");
        }
    }
}



output:

Enter the size of the rows: 
2
Enter the size of the column: 
2
Enter the array elements: 
1
2
3
4
Enter the element to search: 
3
Element is there!!







Enter the size of the rows: 
3
Enter the size of the column: 
4
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
2
3
4
Enter the element to search: 
0
Element is not there!!
