import java.util.Scanner;
public class WhileNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int i=n;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
}


/* Enter n

7

7
6
5
4
3
2
1

*/