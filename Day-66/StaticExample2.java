package Static;

public class StaticExample {
    static int a, b;

    // static block
    static{
        System.out.println("Inside a static block!!");
        a = 10;
        b=20;
        System.out.println(a+b);
    }



    // static method
    static void function1(){
        System.out.println("Inside a static method!!");
        System.out.println(a+b);
    }

    // instance variables
    int x , y;

    // instance block or non static block
    void function2(){
        System.out.println("Inside a instance method!!");
    }

    // instance block
    {
        System.out.println("Instance block!!");
    }

    // constructor
//    StaticExample(){
//        System.out.println("Inside a constructor!!");
//    }

    public static void main(String[] args) {
        function1();

        StaticExample ex = new StaticExample();
        ex.function2();

        System.out.println(a+b);
    }
}



// static variables are declared within a class but access inside a block , method or main method.

Inside a static block!!
30
Inside a static method!!
30
Instance block!!
Inside a instance method!!
30