import java.util.Scanner;
public class whileSumofEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;
        while(i<=n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}

/*
Enter n
3
//2

5
//6

7
//12

*/
