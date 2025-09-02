package ArrayPackage;

import java.util.Scanner;
public class OccuranceOfElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the" + size + " array elements: ");

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to check occurances: ");
        int number = sc.nextInt();

        int count = 0;

        for(int i = 0;i<size;i++){
            if(arr[i] == number){
                count++;
            }
        }
        System.out.println("Occurances: " + count);
    }
}


/*

Enter the size of the array: 
6
Enter the6 array elements: 
3
4
2
1
1
1
Enter the number to check occurances: 
6
Occurances: 0

*/

/*

Enter the size of the array: 
5
Enter the5 array elements: 
5
5
3
2
5
Enter the number to check occurances: 
5
Occurances: 3

*/