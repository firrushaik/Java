public class LogicalOperatorEx {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        int z = 20;
        System.out.println(x>y && y>z);
        System.out.println(y>x || y>z);
        System.out.println(! (z<x));
    }
}


/*
false
true
true
*/
