package ArrayPackage;

import java.util.Scanner;
public class Sort0s1s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        // read array elements
        for(int i = 0;i<size;i++){
            arr[i]=sc.nextInt();
        }


        int zerosCount = 0;
        int onesCount = 0;
        int twosCount = 0;
        for(int i = 0;i<size;i++) {
            if (arr[i] == 0) {
                zerosCount++;
            } else if (arr[i] == 1) {
                onesCount++;
            } else if (arr[i] == 2) {
                twosCount++;
            }
        }

            for(int i = 0; i<zerosCount;i++){
                arr[i]=0;
            }
            for(int i=zerosCount;i<zerosCount+onesCount;i++){
                arr[i] = 1;
            }
            for(int i = zerosCount+onesCount ; i<size-1;i++){
                arr[i] = 2;
        }
            for(int i=0;i<size-1;i++){
                System.out.print(arr[i] + " ");
            }
    }
}


/*

Enter the size of the array : 
8
Enter the 8 array elements: 
2
1
2
1
0
1
0
0
0 0 0 1 1 1 2 

*/

/*

Enter the size of the array : 
5
Enter the 5 array elements: 
1
2
0
1
2
0 1 1 2 
Process finished with exit code 0

*/