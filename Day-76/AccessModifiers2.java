
package AccessModifiers;

public class Example2 {
    public static void main(String[] args) {

        Example1 object1 = new Example1();
        System.out.println(object1.i);
        System.out.println(object1.name);

        // private variables -> objectname.getVariableName
        System.out.println(object1.getSalary());
        object1.disp();

        // static method -> className.objectName
        Example1.print();

        // private method
        // private methods cannot be accessed

    }
}


o/p:

1
Rock
20000
Inside the instance Display method..
Inside the static print method
