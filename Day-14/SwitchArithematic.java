import java.util.Scanner;
public class SwitchArithematic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter second number");
        int number2 = sc.nextInt();
        System.out.println("Enter operator:");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+' :
                System.out.println("Addition is: " + (number1+number2));
                break;
            case '-':
                System.out.println("Subtraction is: " + (number1-number2));
                break;
            case '*':
                System.out.println("Multiplication is: " + (number1*number2));
                break;
            case '/':
                System.out.println("Devision is: " + (number1/number2));
                break;
            case '%':
                System.out.println("Modulus is: " + (number1%number2));
                break;
            default:
                System.out.println("please enter correct operator. It should be + , - , * , / , % ");
                break;

        }
    }
}
