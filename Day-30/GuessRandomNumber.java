import java.util.Scanner;
public class GuessRandomNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100);

        Scanner sc = new Scanner(System.in);
        int chances=1;

        boolean isWin = false;

        while(chances<=5){
            System.out.println("Enter the guess number: ");
            int guess = sc.nextInt();

            if(guess==number){
                isWin = true;
                System.out.println("Congratulations!!!!");
                System.out.println("You took" + chances + "chances to guess");
                break;
            }
            else if(guess>number){
                System.out.println("Your guess is grater than the number");
            }
            else if(guess<number){
                System.out.println("Your guess is lessthan the number");
            }
            chances++;
        }
        if(!isWin)
            System.out.println("You lost the game..the number is " + number);
    }
}


/*

Enter the guess number: 
45
Your guess is lessthan the number
Enter the guess number: 
67
Your guess is lessthan the number
Enter the guess number: 
89
Your guess is lessthan the number
Enter the guess number: 
97
Congratulations!!!!
You took4chances to guess

*/

