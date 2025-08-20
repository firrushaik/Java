import java.util.Scanner;
public class print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}

/* Enter n

6

1
2
3
4
5
6

*/

