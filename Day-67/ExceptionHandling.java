Exception Handling:
        
            In Java, exception handling is a mechanism to handle runtime errors, allowing the normal flow of a program to continue. 
            Exceptions are events that occur during program execution that disrupt the normal flow of instructions.

Basic try-catch Example:

The try block contains code that might throw an exception,
The catch block handles the exception if it occurs.

class Example{
    public static void main(String[] args) {
        
        int n = 10;
        int m = 0;

        try {
            int ans = n / m;
            System.out.println("Answer: " + ans);
        } catch (ArithmeticException e){
            System.out.println("Error: Division by 0!");
        } 
    }
}

Output:
Error: Division by 0!

Finally Block:

The finally block always executed whether an exception is thrown or not. 
The finally is used for closing resources like db connections, open files and network connections, It is used after a try-catch block to execute code that must run.


class FinallyExample {
    public static void main(String[] args){
        
        int[] numbers = { 1, 2, 3 };
        try {
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);
                                       
        }
        catch (ArrayIndexOutOfBoundsException e){
            
            System.out.println("Exception caught: " + e);
        }
        finally{
            System.out.println("This block always executes.");
        }
        System.out.println("Program continues...");
    }
}


Output:

Exception caught: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
This block always executes.
Program continues...





