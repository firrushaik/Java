package Strings;


public class stringEx3 {
    public static void main(String[] args) {
        String name = "Shaik";
        String name1 = "Firdose";
        String name2 = "shaik";
        String name3 = "Firdose";

        //print memory address
        System.out.println(name.hashCode()); // The hashCode() it will print the memory address
        System.out.println(name1.hashCode()); //The name1 and name3 print the same memory address
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());
    }
}


output:

79847086
815179916
109399758
815179916
