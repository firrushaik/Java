package ArrayPackage;

import java.util.Scanner;

public class leadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //logic for leaders
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[arr.length - 1]);
    }
}


output:

Enter the size of the array: 
6
Enter the 6 array elements: 
3
4
5
7
8
9
9





Enter the size of the array: 
4
Enter the 4 array elements: 
3
2
1
0



Enter the size of the array: 
5
Enter the 5 array elements: 
2
3
6
2
3
6
3
