import java.util.Scanner;
public class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers : ");
        int numberOfPrimeNumbers = sc.nextInt();     //8
        int count = 0;

        int num = 1;

        while(true){
            if(count==numberOfPrimeNumbers){
                break;
            }
            int factors = 0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    factors++;
                }
            }
            if (factors == 2) {
                System.out.println(num);
                count++;
            }
            num = num+1;
        }
    }
}

/*
Enter the number of prime numbers : 
8

2
3
5
7
11
13
17
19
*/