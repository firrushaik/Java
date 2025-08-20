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


/*

Enter n
5
120

Enter n
4
24

*/