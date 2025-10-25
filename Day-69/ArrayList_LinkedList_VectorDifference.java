
ArrayList:
Array List is an implemented class of List interface which is present in package java.util. 
Array List is created on the basis of the growable or resizable array. And Array List is an index-based data structure. 
In ArrayList, the element is stored in a contiguous location.  It can store different data types. And random access is allowed. 
We can also store the duplicate element in Array List. It can store any number of null values

Example:

// Java program to Illustrate working of an ArrayList

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an ArrayList of Integer type
        ArrayList<Integer> arrli = new ArrayList<Integer>();

        // Appending the new elements
        // at the end of the list
        // using add () method via for loops
        for (int i = 1; i <= 5; i++)
            arrli.add(i);

        // Printing the ArrayList
        System.out.println(arrli);

        // Removing an element at index 3
        // from the ArrayList
        // using remove() method
        arrli.remove(3);

        // Printing the ArrayList after
        // removing the element
        System.out.println(arrli);
    }
}

output:

[1, 2, 3, 4, 5]
[1, 2, 3, 5]


Linked list:
    It is a linear data structure where data are not stored sequentially inside the computer memory but they are link with each other by the address. 
    The best choice of linked list is deletion and insertion and worst choice is retrieval . In Linked list random access is not allowed . It traverse through iterator. 


Vector:
The Vector class implements a growable array of objects. 
Vectors fall in legacy classes, but now it is fully compatible with collections. It is found in java.util package and implement the List interface

example:

// Java Program to Demonstrate Working
// of Vector Via Creating and using it

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Size of the Vector
        int n = 5;

        // Declaring the Vector with
        // initial size n
        Vector<Integer> v = new Vector<Integer>(n);

        // Appending new elements at
        // the end of the vector
        for (int i = 1; i <= n; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the vector
        // after deletion
        System.out.println(v);

        // iterating over vector elements
        // using for loop
        for (int i = 0; i < v.size(); i++)

            // Printing elements one by one
            System.out.print(v.get(i) + " ");
    }
}


output:

[1, 2, 3, 4, 5]
[1, 2, 3, 5]
1 2 3 5 



Difference between Array List,Linked List, and Vector:


Subject           	Array List	                 Linked List	                       Vector
synchronized	    Not present	                  Not present            	           present
Random access	     Allowed	                   Not Allowed	                        Allowed
Memory Location	    contiguous 	                    Not contiguous 	                    contiguous 
Null values	         supports	                      supports	                          supports
Data structure	     Dynamic Array	                Doubly Linked List	                 Dynamic Array
Duplicate allowed	   Yes	                            Yes	                                  Yes
Operation	       Insertion and deletion are slow	Insertion and deletion are fast	Insertion and deletion are slow
