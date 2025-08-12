import java.util.Scanner;
public class Patterns3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        for(int num1 = 1; num1<=num ; num1++){
            for(int num2 = 1 ; num2<=num ; num2++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}


/* n =4

* * * *
* * * *
* * * *
* * * * 

*/