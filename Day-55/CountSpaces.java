import java.util.Scanner;

public class CountSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String str = sc.nextLine();

        int result = countSpaces(str);
        System.out.println("total spaces are: " + result);

    }
    static int countSpaces(String str){
        int totalSpaces = 0;
        str = str.trim();
        for(int i = 0 ;i<str.length();i++) {
            if (str.charAt(i) == ' ') {
                totalSpaces++;
            }
        }

        return totalSpaces;
    }

}



output:

Enter the sentence: 
java is easy to learn
total spaces are: 4

