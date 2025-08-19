import java.util.Scanner;
public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

         int totalFactors=0;
         for(int i=1;i<=n;i++){
             if(n%i ==0){
                 totalFactors++;
             }
         }
         if(totalFactors==2){
             System.out.println("Prime number");
         }
         else{
             System.out.println("Not prime number");
         }
    }
}


/*

Enter n
3 
Prime number

Enter n
6
Not prime number

*/