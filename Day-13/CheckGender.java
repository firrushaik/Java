import java.util.Scanner;

public class CheckGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        char ch = sc.next().charAt(0);
        if(ch=='F'|| ch=='f'){
            System.out.println("Female");
        }
        else if(ch == 'M'|| ch=='m'){
            System.out.println("Male");
        }
        else{
            System.out.println("Others");
        }
    }
}



o/p:

Enter your gender: 
m
Male
