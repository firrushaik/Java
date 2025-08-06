Type Casting : The process of converting the value of one data type(int,boolean,long, etc) to another data type. It is known as typecasting.

Types of type casting :

Widening Type Casting(Implicit)
Narrowing Type Casting(Explicit)

Widening Type Casting : The lower data type is transformed into a higher one by a process known as "widening type casting ."
Implicit type casting and casting down are the same name for it.
It accurs naturally, since there is no chance of data loss. It is secure.

Widening typecasting occurs when:

The target type must be larger than the source type.
Both data types must be compatible with each other.


class ImplicitEx {
    public static void main(String[] args)
    {
        int i = 10;

        // Wideing TypeCasting (Automatic Casting)
        // from int to long
        long l = i;

        // Wideing TypeCasting (Automatic Casting)
        // from int to double
        double d = i;

        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Double: " + d);
    }
}

output :
Integer: 10
Long: 10
Double: 10.0

Narrowing Type Casting(Explicit): The process of converting a bigger data type into lower data type is known as "Narrowing Type Casting".
Casting up or explicit type casting are other names for it .
It does not happen by itself.
If we dont explicitly do that , a compile time error will occur.
Narrowing typecastingis unsafe because data loss might happen due to the lower data types smaller range of permitted values.

Example:

 class ExplicitEx {
    public static void main(String[] args)
    {
        double i = 100.245;

        // Narrowing Type Casting
        short j = (short)i;
        int k = (int)i;

        System.out.println("Original Value before Casting"
                           + i);
        System.out.println("After Type Casting to short "
                           + j);
        System.out.println("After Type Casting to int "
                           + k);
    }
}


output:

Original Value before Casting100.245
After Type Casting to short 100
After Type Casting to int 100
