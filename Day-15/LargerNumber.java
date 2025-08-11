import java.util.Scanner;
public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter your third number: ");
        int num3 = sc.nextInt();
        System.out.println("The largest number among all the three numbers is: ");
        if(num1>num2 && num1>num3){
            System.out.println(num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2);
        }
        else if(num3>num1 && num3>num2){
            System.out.println(num3);
        }
        else {
            System.out.println("There is no larger number among three because all are equal");
        }
    }
}
