import java.util.Scanner;
public class PrintOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("enter the " + size + " array elements: ");

        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("odd numbers is : ");
        for(int i = 0; i<=size-1;i++){
            if(arr[i]%2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}


/*

Enter the size of the array: 
3
enter the 3 array elements: 
2
2
2
odd numbers is : // all are enterd even numbers because it cannot print anything

*/

/*

Enter the size of the array: 
4
enter the 4 array elements: 
2
3
4
5
odd numbers is : 
3
5

*/