public class ArithematicOperatorEx  {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " +(a*b));
        System.out.println("a/b = " +(a/b));
        System.out.println("a%b = " +(a%b));
        System.out.println(a+b*b/a-b); //BODMAS
    }
}

/*
a+b = 30
a-b = -10
a*b = 200
a/b = 0
a%b = 10
30
*/