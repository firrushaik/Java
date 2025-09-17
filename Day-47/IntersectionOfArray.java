package ArrayPackage;

import java.util.Scanner;
public class IntersectionOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array: ");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the " + size + " array elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int secondArraySize = sc.nextInt();

        int[] b = new int[secondArraySize];
        System.out.println("Enter the " + secondArraySize + " array elements: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        //logic
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                System.out.println(a[i]);
                break;
            }
        }
    }
    }
}


o/p:

Enter the size of the first array: 
3
Enter the 3 array elements: 
1
2
3
Enter the size of the second array: 
5
Enter the 5 array elements: 
2
3
6
7
8
2
3