Variables are containers used to store the data.

Types of variables :

Local variable 
Static variable
Instance variables

Local variables : Local variables are declared within a method or block.
Example :

class LocalEx
{
public static void main(String[] args)
{
int age = 24;
System.out.println("age is:" + age);
}
}

out put : 
age is: 24

Static variable : Static variables are declared with a static keyword within a class but outside a method.
It is also called as Class variables.

Example :

class StaticEx
{
static int age = 20;
public static void main(String[] args)
{
System.out.println("age is:" + age);
}
}

output : age is :20

Instance variables : Instance variables are declared within a class but outside a method or block.
 
 Example :

 class InstanceEx
{
String name ;
public static void main(String[] args)
{
InstanceEx b1 = new InstanceEx();
b1.name = "firru";
System.out.println("My name is:" + b1.name);
}
} 

output :
My name is:firru

Some other example :

class InstanceEx
{
int age ;
public static void main(String[] args)
{
InstanceEx b1 = new InstanceEx(); // We should not assign a value to variable , It will take the default value as 0
System.out.println("My age is:" + b1.age);
}
}

output :
My age is: 0