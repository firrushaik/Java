import java.util.Scanner;
public class even1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int i=1;
        while(i<=n) {
            if(i%2==0){
                System.out.println(i+" "+ "Is a even number");
            }
            i++;
        }
    }
}

/*
Enter n
10
2 Is a even number
4 Is a even number
6 Is a even number
8 Is a even number
10 Is a even number

Enter n
7
2 Is a even number
4 Is a even number
6 Is a even number

*/
