import java.util.Scanner;
public class sumOf1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}

/*
Enter n
7
28

Enter n
5
15

*/
