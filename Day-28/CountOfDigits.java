import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int count = 0;

        while(n!=0){
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}


/*
Enter the number
567
3

789
3

23
2

7
1
*/