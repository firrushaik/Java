import java.util.Scanner;
public class SumOfArrayElements {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for(int i =0;i<=size-1;i++){
            arr[i] =sc.nextInt();
        }

        int sum = 0;
        for(int i =0; i<=size-1 ;i++){
            sum = sum+arr[i];
        }
        System.out.println("sum of array elements is: " + sum);
    }
}


/*

Enter the size of the array: 
3
Enter the 3 array elements: 
10
20
30
sum of array elements is: 60
