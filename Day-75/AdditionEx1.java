package Java8_Features;


interface Add{
    int add(int a, int b);
}

public class Addition implements Add{
    public int add(int a, int b){
        System.out.println(a+b);
    };
}

public class AdditionEx1 {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(10,20));
    }
}

o/p:
30