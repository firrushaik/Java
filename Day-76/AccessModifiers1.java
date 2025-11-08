

package AccessModifiers;

public class Example1 {
    public int i = 1;
    public String name = "Rock";

    private int salary = 20000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Instance methods
    public void disp(){
        System.out.println("Inside the instance Display method..");
    }

    // static method

    static void print(){
        System.out.println("Inside the static print method");
    }

    // private method
    private void returns(){
        System.out.println("Inside the private returns method ");
    }


    public static void main(String[] args) {

        // Instance variables
        Example1 object = new Example1();
        System.out.println(object.i);
        System.out.println(object.name);
        System.out.println(object.salary);

        object.disp();
        Example1.print();
        object.returns();
    }
}

o/p:

1
Rock
20000
Inside the instance Display method..
Inside the static print method
Inside the private returns method 

