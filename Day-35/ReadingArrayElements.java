import java.util.Scanner;
public class ReadingArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        
        System.out.println("Enter " + size + " array elements");
        int[] arr = new int[size];

        // reading array data from the user
        for(int i=0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }

        // print array elements
        for(int i = 0;i<=size-1;i++){
            System.out.println(arr[i]);
        }
    }
}


/*

Enter the size of the array
3
Enter 3 array elements
3
5
6
3
5
6

*/