package Strings;


public class stringEx3 {
    public static void main(String[] args) {
        String name = "Shaik";
        String name1 = "Firdose";
        String name2 = "shaik";
        String name3 = "Firdose";

        //print memory address
        System.out.println(name.hashCode()); // The hashCode() it will print the memory address
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());

        name1 = "firdose"; // here not assing a new value to a name1 variable, it will create a new memory in the stringpool
        System.out.println(name1.hashCode());
    }
}
