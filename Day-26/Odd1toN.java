import java.util.Scanner;
public class odd1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n ");
        int n = sc.nextInt();

        int i=1;
        while(i<=n){
            if(i%2 != 0){
                System.out.println(i+ " "+"Odd number");
            }
            i++;
        }
    }
}

/*

Enter n
7
1 Odd number
3 Odd number
5 Odd number
7 Odd number


Enter n
20
1 Odd number
3 Odd number
5 Odd number
7 Odd number
9 Odd number
11 Odd number
13 Odd number
15 Odd number
17 Odd number
19 Odd number

*/