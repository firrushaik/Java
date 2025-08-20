import java.util.Scanner;
public class whileLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();

        int i=1;
        int factorial=1;
        while(i<=n){
            factorial*=i;
            i++;
        }
        System.out.println(factorial);
    }
}


/* Enter n

5
120

4
24

*/
