Abstaction:

     Abstraction is defined as hiding the internal implementation and showing only essential functionality to the user.
Abstraction is java can be achieved in two ways:
1)Abstract 
2)interface 

1)Abstact :
      It is a keyword.

return type, method name, parameters is called as Method signature.

eg: void method(){
    // method body or method implementation
}

eg:

package Abstraction;

public abstract class Demo1 {
    abstract void display();
}




package Abstraction;

public class Demo2 extends Demo1{
    public void display(){
        System.out.println("Hello Java!!!!");
    }
}





package Abstraction;

public class DemoObjectClass {
    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        demo.display();
    }
}




output:


Hello Java!!!!