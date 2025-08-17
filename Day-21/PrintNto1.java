import java.util.Scanner;
public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}


/* 

Enter n
6

6
5
4
3
2
1

*/