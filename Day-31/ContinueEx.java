import java.util.Scanner;
public class ContinueEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter the skip number ");
        int skip = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i == skip){
                continue;
            }
            System.out.println(i);
        }
    }
}

/*
Enter number: 
8
Enter the skip number 
4
1
2
3
5
6
7
8
*/
