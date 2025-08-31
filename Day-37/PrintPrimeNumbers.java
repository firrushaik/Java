import java.util.Scanner;
public class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for (int i = 0; i <= size - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("prime numbers");
        for (int i = 0; i <= size - 1; i++) {
            int factors = 0;
            // check it is prime or not we have to travels 1 to element ex 2 is elements
            // we have to travels 1 , 2

            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    factors++;
                }
            }
            if (factors == 2) {
                System.out.println(arr[i]);
            }
        }
    }
}



/*

Enter the size of the array: 
3
Enter the 3 array elements: 
2
3
4
prime numbers
2
3

*/