import java.util.Scanner;
public class PrintMaximumNumber {
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

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<=size-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println( " Maximum element is : " + max);

    }
}


/*

Enter the size of the array: 
3
Enter the 3 array elements: 
3
4
5
 Maximum element is : 5

*/