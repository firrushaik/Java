import java.util.Scanner;
public class WhilePrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int i=1;
        int count = 0;
        while(i<=n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        if(count == 2) {
            System.out.println(n + " is a prime number.");
        }
        else{
            System.out.println(n + " not a prime number.");
        }
    }
}


/*
Enter n
4
4 is not a prime number.

Enter n
7
7 is a prime number.

*/