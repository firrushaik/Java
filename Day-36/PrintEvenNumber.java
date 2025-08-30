import java.util.Scanner;
public class PrintEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("enter the " + size + " array elements: ");

        for(int i =0;i<=size-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Even numbers is : ");
        for(int i = 0; i<=size-1;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}


/*

Enter the size of the array: 
6
enter the 6 array elements: 
2
2
2
2
2
2
Even numbers is : 
2
2
2
2
2
2

*/