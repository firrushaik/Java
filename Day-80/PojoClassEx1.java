
POJO
29 Mar 2025 |  6 min read
POJO in Java stands for Plain Old Java Object. It is an ordinary object, which is not bound by any special restriction. The POJO file does not require any special classpath. It increases the readability & re-usability of a Java program.

POJOs are now widely accepted due to their easy maintenance. They are easy to read and write. A POJO class does not have any naming convention for properties and methods. It is not tied to any Java Framework; any Java Program can use it.

The term POJO was introduced by Martin Fowler (An American software developer) in 2000. It is available in Java from EJB 3.0 by Sun Microsystem.

Generally, POJO class contains variables and their Getters and Setters.

The POJO classes are similar to Beans as both are used to define the objects to increase the readability and re-usability. The only difference between them that Bean Files have some restrictions but, the POJO files do not have any special restrictions.

Example:
POJO class is used to define the object entities. For example, we can create an Employee POJO class to define its objects.

Following is an example of Java POJO class.

Employee.java

// POJO class Exmaple  
package Jtp.PojoDemo;  
public class Employee {  
private String name;  
private String id;  
private double sal;  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getId() {  
    return id;  
}  
public void setId(String id) {  
    this.id = id;  
}  
public double getSal() {  
    return sal;  
}  
public void setSal(double sal) {  
    this.sal = sal;  
}  
}  
The above employee class is an example of an employee POJO class. If you are working on Eclipse, you can easily generate Setters and Getters by right click on the Java Program and navigate to Source-> Generate Getters and Setters.

POJO
Right-click on the Java Program and Select Generate Getters and Setters.

POJO
Now, click on the Generate option given at the bottom of the Generate window. It will auto-generate setters and getters.

How to use POJO Class in a Java Program?
The POJO class is created to use the objects in other Java Programs. The major advantage of the POJO class is that we will not have to create objects every time in other Java programs. Simply we can access the objects by using the get() and set() methods.

To access the objects from the POJO class, follow the given steps:

Create a POJO class objects
Set the values using the set() method
Get the values using the get() method
For example, create a MainClass.java class file within the same package and write the following code in it:

MainClass.java

//Using POJO class objects in MainClass Java program  
package Jtp.PojoDemo;  
public class MainClass {  
    public static void main(String[] args) {  
        // Create an Employee class object  
Employee obj= new Employee();  
obj.setName("Alisha"); // Setting the values using the set() method  
obj.setId("A001");  
obj.setSal(200000);  
System.out.println("Name: "+ obj.getName()); //Getting the values using the get() method  
System.out.println("Id: " + obj.getId());  
System.out.println("Salary: " +obj.getSal());  
    }  
}  
Output:

Name: Alisha
Id: A001
Salary: 200000.0
