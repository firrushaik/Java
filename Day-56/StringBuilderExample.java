package StringBuilder;

public class Example1 {
    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder("Hello");
//        System.out.println(stringBuilder);


        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb); //Hello

        sb.append(" Friend");
        System.out.println(sb); //Hello Friend


        sb.reverse();
        System.out.println(sb); //dneirF olleH
        System.out.println(sb.length()); //12

        System.out.println(sb.substring(0,4)); // 0 1 2 3 dnei

//        System.out.println(sb.substring(0,14)); //String Index Out of Bounds Exception

        System.out.println(sb.replace(0,1,"i")); //ineirF olleH

        System.out.println(sb);

        String str = "HELLO";
        System.out.println(str);

        str = str.toLowerCase();
        System.out.println(str);
    }
}


output:

Hello
Hello Friend
dneirF olleH
12
dnei
ineirF olleH
ineirF olleH
HELLO
hello

