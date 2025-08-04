Final variable : When a variable is declared final , its value cannot be reassigned after initialization. 

Syntax : final DataType VariableName = Value ;

eg: 

class Abc{
public static void main(String[] args)
{
final int a = 200;
a = 300;
System.out.println("a value is:"+a);
}
}

output : error: cannot assign a value to final variable a // error will be generated
a = 300 ;