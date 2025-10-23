for each loop:

      The for-each loop in Java (also called the enhanced for loop) was introduced in Java 5 to simplify iteration over arrays and collections. It is cleaner and more readable than the traditional for loop and is commonly used when the exact index of an element is not required.

Example: Using a for-each loop to print each element of an array in Java.


example:

// Java Program to Iterate through an array
// Using for-each loop
import java.io.*;

class Geeks {
  
    public static void main(String[] args) {
      
        // Array declaration
        int arr[] = { 1, 2, 3, 4, 5 };
        
        // Using for-each loop to 
        // print each element
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}

output:

1 2 3 4 5 




