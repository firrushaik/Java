import java.util.Scanner;
public class printN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}


/* 
Enter n: 6

1
2
3
4
5
6

*/