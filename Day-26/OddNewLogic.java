import java.util.Scanner;
public class oddNewLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        int i = 1;
        while(i<=n){
            System.out.println(i);
            i = i+2;
        }
    }
}

/*
Enter n
8

1
3
5
7

*/