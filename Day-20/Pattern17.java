import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(((char)('A'+i-1))+ " ");
            }
            System.out.println();
        }
    }
}
  


/* 
output:
n=5

      A 
    B B 
  C C C 
D D D D 


*/