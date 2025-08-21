import java.util.Scanner;
public class evenNumbwesNewLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        int i = 2;
        while(i<=n){
            System.out.println(i);
            i=i+2;
        }
    }
}

/*
Enter n
9

2
4
6
8

*/