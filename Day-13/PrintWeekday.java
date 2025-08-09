import java.util.Scanner;

public class PrintWeekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weekday number: ");
        int weekday = sc.nextInt();

        if(weekday==1){
            System.out.println("Sunday");
        }
        else if(weekday==2){
            System.out.println("Monday");
        }
        else if(weekday==3){
            System.out.println("Tuesday");
        }
        else if(weekday==4){
            System.out.println("Wednesday");
        }
        else if(weekday==5){
            System.out.println(weekday==6);
        }
        else if(weekday==6){
            System.out.println("Friday");
        }
        else if(weekday==7){
            System.out.println("Saturday");
        }
        else {
            System.out.println("Please enter correct weekday number. It should be between 1 to 7.");
        }
    }
}
