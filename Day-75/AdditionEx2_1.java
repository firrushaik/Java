package Java8_Features;


interface Add{
    int add(int a, int b);
}



public class AdditionEx1 {
    public int add(int a , int b){
        return (a+b);
    }

    public static void main(String[] args) {
        AdditionEx1 addition = new AdditionEx1();
        System.out.println(addition.add(20,30));
    }
}

o/p:

50