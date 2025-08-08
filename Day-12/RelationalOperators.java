Relational operators : Java relational operators are used to compare two values.
These operators return a boolean result: true if the condition is met and false otherwise.
Relational operators are commonly used in decision-making statements like if conditions and loops.

Java relational operatores are 6 types : 

 == (equal to)

 != (not equal to)

 > (greater than)
 
 < (less than)

 >= (greater than or equal to)

 <= (less than or equal to)


  Operator                                  Description                                                             Example

== (equal to)	                 Checks if two values are equal.	                                         (A == B) returns false if A is not equal to B.
!= (not equal to)	             Checks if two values are not equal.	                                     (A != B) returns true if A is not equal to B.
> (greater than)	             Checks if the left operand is greater than the right operand.	             (A > B) returns true if A is greater than B.
< (less than)	                 Checks if the left operand is smaller than the right operand.	             (A < B) returns true if A is less than B.
>= (greater than or equal to)	 Checks if the left operand is greater than or equal to the right operand.	 (A >= B) returns true if A is greater than or equal to B.
<= (less than or equal to)	     Checks if the left operand is smaller than or equal to the right operand.	 (A <= B) returns true if A is less than or equal to B.


Example :

class RelationalOperatorEx {
    
    // main function
    public static void main(String[] args)
    {
        // Comparison operators
        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
    }
}

output :

a > b: true
a < b: false
a >= b: true
a <= b: false
a == c: false
a != c: true