import java.util.Scanner;
public class sumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += i;
        }
        System.out.println("Sum of n is: " + count);
    }
}

/* n=6

1
2
3
4
5
6
Sum of n is: 21

*/