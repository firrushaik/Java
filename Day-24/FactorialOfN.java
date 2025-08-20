import java.util.Scanner;
public class factorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial= factorial*i;
        }
        System.out.println(factorial);
    }
}


/* Enter n
6
720

3
6

*/