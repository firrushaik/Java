Local variable example :

class LocalEx1
{
    public static void main(String[] args)
    {
     int year ; // when we will not initialize a value to a variable in ocal variables it won't be take any default value
     System.out.println("year is:" + year);
    }
}

output :
 error: variable year might not have been initialized
     System.out.println("year is:" + year);
                                     


Static variable Example :

class StaticEx2
{
static int year;
public static void main(String[] args)
{
System.out.println("year is:" + year); // We should not assign a value to a variable, In static variable it will take by default value as 0
}
}

output: year is: 0



Instance variable example:

class InstanceEx1
{
int year;
public static void main(String[] args)
{
InstanceEx1 d1 = new InstanceEx1(); 

// we shold not assign a value to a variable , in instance variable it will take by default value as 0
// we should create a object name as variable name ,it will be accessable

System.out.println("year is:" + d1.year);
}
}

output : year is: 0