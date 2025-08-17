import java.util.Scanner;
public class countFactorsOfN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println( i + " is a factor");
            }
        }
        int TotalFactors = 0;
        for(int i=1;i<=n;i++){
            if(n%i ==0){
                TotalFactors++;
            }
        }


        System.out.println("Total factors of n is: " + TotalFactors);
    }
}

/*

Enter n

8

1 is a factor
2 is a factor
4 is a factor
8 is a factor
Total factors of n is: 4

*/