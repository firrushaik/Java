import java.util.Scanner;
class patterns16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(((char)('A'+i-1)) + " ");
            }
            System.out.println();
        }
    }
}


/* output:

n=4

A A A A 
B B B B 
C C C C 
D D D D 
 
*/