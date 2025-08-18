import java.util.Scanner;
public class sumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter n ");
        int n = sc.nextInt();

        int sum=0;
        for(int i =1;i<=n;i++){
            if(i%2 == 0){
                sum += i ;
            }
        }
        System.out.println(sum);
    }
}

/*

 Enter n 
6

12

*/
