import java.util.Scanner;
public class factorsOfN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println( i + " is a factor");
            }
        }
    }
}


/* Enter n

6

1 is a factor
2 is a factor
3 is a factor
6 is a factor

*/