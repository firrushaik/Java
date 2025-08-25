import java.util.Scanner;
public class BreakEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enthe number ");
        int n = sc.nextInt();

        int count = 0;
        for(int i=1;i<=n;i++){
            if(count==5){
                break;
            }
            System.out.println(i);
            count++;
        }
    }
}


/*
Enthe number 
6
1
2
3
4
5
*/