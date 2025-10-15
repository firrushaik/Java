package Static;

public class StaticExample {
    static int a, b;

    // static block
    static{
        System.out.println("Inside a static block!!");
    }

    // static method
    static void function1(){
        System.out.println("Inside a static method!!");
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
    StaticExample(){
        System.out.println("Inside a constructor!!");
    }

    public static void main(String[] args) {
        function1();

    // must we have to  create the object to access the instance method ,first it will call the constructor after that it will call the method
        StaticExample ex = new StaticExample();
        ex.function2();
    }
}



output:

Inside a static block!!
Inside a static method!!
Instance block!!
Inside a constructor!!
Inside a instance method!!

Process