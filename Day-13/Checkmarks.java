import java.util.Scanner;
public class Checkmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you marks: ");
        int marks = sc.nextInt();
        if(marks>=35){
            System.out.println("Congratulations! you are pass.");
        }
    }
}
