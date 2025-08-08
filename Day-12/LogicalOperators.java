Logical operators :Java logical operators are used to perform logical operations on boolean values. 
These operators are commonly used in decision-making statements such as if conditions and loops to control program flow.


   Operator	                          Description	                                                                 Example

&& (Logical AND)	 Returns true if both operands are true, otherwise returns false.	       (A && B) returns true if both A and B are true.

|| (Logical OR)	     Returns true if at least one of the operands is true.	                   (A || B) returns true if either A or B is true.

! (Logical NOT)	     Reverses the logical state of the operand.	                               !A returns true if A is false, and false if A is true.


Truth table :

   A                  B                  A && B                        A || B              

   T                  T                    T                              T                     
   
   T                  F                    F                              T                      

   F                  T                    F                              T                      

   F                  F                    F                              F      


   Example:               

   class LogicalOperatorsEx {
  
      // Main Function
    public static void main (String[] args) {
      
        // Logical operators
        boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}

output :

x && y: false
x || y: true
!x: false