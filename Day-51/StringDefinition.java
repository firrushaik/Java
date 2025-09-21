String is a sequence of character.
String is a non premitive data type as well as class that's we used first letter as capital in string.

//declare and initialize a string
String variableName = "Value";
eg:String name = "Firdose";

//Some other way to store a string value
String variableName = new String("Value");
String name1 = new String("firdose");

There is a special area inside the heap area is called "String pool".
Whenever we are assinging directly to the string value to the string dataType so, It will store in a special area is called "String pool" which is present in the heap area.


//we have to check memory address by using hashCode() method 
System.out.println(variableName.hashCode());


 String name = "Shaik";
        String name1 = "Firdose";
        String name2 = "shaik";
        String name3 = "Firdose";

        //print memory address
        System.out.println(name.hashCode()); // The hashCode() method , it will print the memory address
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());

        name1 = "firdose";
        System.out.println(name1.hashCode());

        output:

        79847086
        815179916
        109399758
        815179916
        -849473364 *

        When we assign a value to a string datatype it will store the value in a special area called "string pool". 
        which is present in the heap area.

        eg: If we take two variables has same value, instead of creating new memory, it will point to same address.
        once we change the value of any those variables instead of updating the current address value, It will create a new memory and points that particular variable to new memory. 





