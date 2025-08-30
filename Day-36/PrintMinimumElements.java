import java.util.Scanner;
public class PrintMinimumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        // print array elements
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<=size-1;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println( " Minimum element is : " + min);

    }
}


/*

Enter the size of the array: 
3
Enter the 3 array elements: 
4
5
6
Minimum element is : 4

*/