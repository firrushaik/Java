throw and throws Keywords:

1. throw: Used to explicitly throw a single exception. 
We use throw when something goes wrong (or “shouldn’t happen”) and we want to stop normal flow and hand control to exception handling.

Example:

class Demo {
    static void checkAge(int age) {
        
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        
        checkAge(15);
    }
}

Output:

Exception in thread "main" java.lang.ArithmeticException: Age must be 18 or above

	at Demo.checkAge(Demo.java:5)

	at Demo.main(Demo.java:11)

2. throws: Declares exceptions that a method might throw, informing the caller to handle them. 
It is mainly used with checked exceptions (explained below). If a method calls another method that throws a checked exception, and it doesn’t catch it, it must declare that exception in its throws clause


Example:

import java.io.*;
​
class Demo {
    static void readFile(String fileName) throws IOException {
        
        FileReader file = new FileReader(fileName);
    }
​
    public static void main(String[] args){
        
        try {
            readFile("test.txt");
        } catch (IOException e){
            
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

Output
File not found: test.txt (No such file or directory)
