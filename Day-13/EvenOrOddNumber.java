import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number: ");
        int num = sc.nextInt();
        //if the number devided by 2 and remainder will be 0 then it is a even number.
        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }


    }
}