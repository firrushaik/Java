import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Your eligible for vote");
        }
        else{
            System.out.println("Your not eligible for vote");
        }
    }
}
